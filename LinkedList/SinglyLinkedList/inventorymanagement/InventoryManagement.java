package inventorymanagement;

public class InventoryManagement {
    Item head = null;

    // Add item at position (0: beginning, -1: end, or index)
    public void addItem(String name, int id, int quantity, double price, int position) {
        Item newItem = new Item(name, id, quantity, price);

        if (head == null || position == 0) {
            newItem.next = head;
            head = newItem;
            return;
        }

        Item current = head;
        int index = 1;

        if (position == -1) { // Add at end
            while (current.next != null)
                current = current.next;
            current.next = newItem;
        } else { // Add at specific position
            while (index < position && current.next != null) {
                current = current.next;
                index++;
            }
            newItem.next = current.next;
            current.next = newItem;
        }
    }

    // Remove item by ID
    public void removeItem(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            return;
        }

        Item current = head;
        while (current.next != null && current.next.id != id) {
            current = current.next;
        }

        if (current.next != null)
            current.next = current.next.next;
    }

    // Update quantity by ID
    public void updateQuantity(int id, int newQty) {
        Item current = head;
        while (current != null) {
            if (current.id == id) {
                current.quantity = newQty;
                return;
            }
            current = current.next;
        }
    }

    // Search by ID or Name
    public void searchItem(String keyword) {
        Item current = head;
        boolean found = false;
        while (current != null) {
            if (String.valueOf(current.id).equals(keyword) || current.name.equalsIgnoreCase(keyword)) {
                System.out.println("Item: " + current.name + ", ID: " + current.id + ", Qty: " + current.quantity + ", Price: " + current.price);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("Item not found.");
    }

    // Calculate total inventory value
    public void calculateTotalValue() {
        Item current = head;
        double total = 0;
        while (current != null) {
            total += current.price * current.quantity;
            current = current.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    // Display all items
    public void displayAll() {
        Item current = head;
        if (current == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        while (current != null) {
            System.out.println("Item: " + current.name + ", ID: " + current.id + ", Qty: " + current.quantity + ", Price: ₹" + current.price);
            current = current.next;
        }
    }

    // Sort by Name or Price (Merge Sort for linked list)
    public void sortInventory(String basis) {
        head = mergeSort(head, basis);
    }

    private Item mergeSort(Item head, String basis) {
        if (head == null || head.next == null) return head;

        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, basis);
        Item right = mergeSort(nextOfMiddle, basis);

        return sortedMerge(left, right, basis);
    }

    private Item sortedMerge(Item a, Item b, String basis) {
        if (a == null) return b;
        if (b == null) return a;

        Item result;
        if ((basis.equals("name") && a.name.compareToIgnoreCase(b.name) <= 0) ||
            (basis.equals("price") && a.price <= b.price)) {
            result = a;
            result.next = sortedMerge(a.next, b, basis);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, basis);
        }

        return result;
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;

        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
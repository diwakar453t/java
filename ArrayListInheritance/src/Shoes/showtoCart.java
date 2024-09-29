package Shoes;

import java.util.LinkedList;



    class showtoCart {
        private LinkedList<Object> items;

        public showtoCart() {
            this.items = new LinkedList<>();
        }

        public void addItem(Object item) {
            items.add(item);
        }
}

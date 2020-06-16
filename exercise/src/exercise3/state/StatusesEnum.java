package exercise3.state;

public class StatusesEnum {
    public enum Statuses {
        NEW_ORDER(1),
        PROCESSING(2),
        IN_STORAGE(3);

        private int value;
        private String name;

        Statuses(int value, String name) {
            this.value = value;
            this.name = name;
        }

        Statuses(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getName() {
            return this.name();
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

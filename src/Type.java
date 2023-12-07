public enum Type {
    POTATOES, CHICKEN, APPLE;

    public String getType(Type type) {
        switch (type) {
            case POTATOES -> {
                return "Potatoes";
            }
            case CHICKEN -> {
                return "Chicken";
            }
            case APPLE -> {
                return "Apple";
            }
            default -> {
                return "Unknown";
            }
        }
    }
}

static class DivOperation implements Operations {
    @Override
    public String toString() {
        return "Divide Operation: ";
    }

    public int operation (int[] v1) {
        return v1[0] / v1[1];
    }
    public int getOperationType(){
        return 2;
    }
}
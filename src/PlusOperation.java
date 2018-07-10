class PlusOperation implements Operation {
  @Override
  public String toString() {
    return "Plus Operation: ";
  }

  public int operation(int[] v1) {
    return v1[0] + v1[1];
  }

  @Override
  public int getOperationType() {
    return 2;
  }
}
void main() {
    String telno = "05331234567";
    if (telno.charAt(0) == '0') {
        if (telno.length() == 11) {
            System.out.println("Numaranız doğru");
        } else {
            System.out.println("Numaranız Yanlış");
            }
    } else {
        System.out.println(" Numaranız Yanlış");
    }
}

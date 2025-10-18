void main() {
    // Senaryo
    String telefon = "01234567890";
    if (telefon.length()==11){
        if (Character.getNumericValue(telefon.charAt(0)) == 0) {
            System.out.println("Telefon numaranız geçerli.");
        }  else {
            System.out.println("Telefon numaranız geçersiz!");
        }
    } else {
        System.out.println("Telefon numaranız geçersiz!");
    }
    // Not
    Double vizenot = 50.0;
    Double finalnot = 80.0;
    Double ortalama = vizenot*0.4+finalnot*0.6;
    if (ortalama >= 75) {
        System.out.println("Barajı geçtiniz. Notunuz: " + ortalama);
    } else {
        System.out.println("Barajı geçemediniz. Notunuz: " + ortalama);
    }
}


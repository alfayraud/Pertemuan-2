public class Main {
    public static void main(String[] args) {

        Hero alfay = new Hero();
        alfay.name = "Alfay";
        alfay.level = 10;
        alfay.hp = 200;
        alfay.showProfile();
        alfay.attack();

        Weapon pedangSakti = new Weapon();
        pedangSakti.name = "Pedang Sakti";
        pedangSakti.damage = 150;

        pedangSakti.showWeapon();
    }
}
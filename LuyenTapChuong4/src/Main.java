public class Main {
    public static void main(String[] args) {
        QuaCam cam = new QuaCam();
        cam.setGiaBan(30);
        cam.setSoLuong(2);
        System.out.println("Thanh tien:  "+cam.tinhTien());
    }
}
package Lesson_4;
// Задание 6. Создать класс Payment с внутренним классом,
// с помощью объектов которого можно сформировать покупку из нескольких товаров.
public class Payment { // Будем делать платёж банковской картой
    private String storeName;
    private String bankCardBrand; // Visa, Mastercard, Union Pay, American Express, JCB, Белкарт etc.
    private long bankCardNumber;
    private int monthOfExpiredOfBankCard;
    private int yearOfExpiredOfBankCard;
    private int cvvOfBankCard;
    private int merchantId;
    private String nameOfBankOfMerchant;
    private String nameOfBankOfIssuerOfCard;
    private String nameOfAcquiringBank;
    private Goods goods;

    public class Goods {
        private String typeOfGoods; // молочные продукты, мясные продукты, овощи, фрукты, хлебо-булочные изделия и т.д.
        private String goodsName;
        private float price;
        private float amount; // Количество товара может быть дробным, например, у весовых товаров
        private int dateOfManufacture;
        private int expirationDate;

        public Goods (String typeOfGoods, String goodsName, float price, float amount, int dateOfManufacture, int expirationDate) {
            this.typeOfGoods = typeOfGoods;
            this.goodsName = goodsName;
            this.price = price;
            this.amount = amount;
            this.dateOfManufacture = dateOfManufacture;
            this.expirationDate = expirationDate;
        }
    }
}

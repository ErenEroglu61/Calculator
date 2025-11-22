# Java Swing Calculator

Bu proje, Java programlama dili ve Swing kütüphanesi kullanılarak geliştirilmiş, çoklu sayı listesiyle temel aritmetik işlemleri yapan bir masaüstü hesap makinesi uygulamasıdır.

## Özellikler

- Girilen sayıları listede tutar.
- Listedeki sayılar üzerinde toplama, çıkarma, çarpma ve bölme işlemleri yapar.
- Sayı listesini görüntüleme ve temizleme imkanı sunar.
- Kullanıcı dostu Swing grafik arayüzü.
- Hatalı girişte veya işlem hatasında kullanıcıyı bilgilendirir.
- Programı güvenli şekilde kapatma seçeneği.

## Kullanım

1. **Sayı girişi**: "Enter number" tuşuna basarak sayı ekleyebilirsiniz.
2. **Listeyi görme**: "Show list" ile girdiğiniz tüm sayıları görebilirsiniz.
3. **Toplama**: "Sum" ile listedeki tüm sayıları toplar.
4. **Çıkarma**: "Subtract" ile listedeki ilk sayıdan başlayıp diğer tüm sayıları çıkarır.
5. **Çarpma**: "Multiply" ile listedeki tüm sayıları çarpar.
6. **Bölme**: "Divide" ile listedeki ilk sayıdan başlayarak tüm sayıları böler (0'a bölme hatası kontrolü vardır).
7. **Listeyi temizleme**: "Empty List" ile listeyi temizleyebilirsiniz.
8. **Çıkış**: "Exit" ile güvenli şekilde programı sonlandırabilirsiniz.

## Ekran Görüntüsü

> Ekran görüntüsünü buraya ekleyebilirsiniz:
>
> ![calculator-ui.png](docs/calculator-ui.png)

## Kurulum ve Çalıştırma

1. Projeyi indirin veya klonlayın:
   ```bash
   git clone https://github.com/ErenEroglu61/Calculator.git
   ```
2. Java'nın kurulu olduğundan emin olun (Java 8 ve üzeri önerilir).
3. Proje klasöründe aşağıdaki komutla çalıştırın:
   ```bash
   javac Main.java
   java Main
   ```

## Kod Yapısı

- **Main.java**: Uygulamanın ana kodu ve Swing arayüzü bu dosyada bulunur.
  - `ArrayList<Double>` ile sayı listesi tutulur.
  - Tüm butonlar ve işlevleri kolayca yönetilir.
  - `JOptionPane` ile kullanıcıya bildirimler ve istemler gösterilir.

## Katkı ve Lisans

Katkıda bulunmak isterseniz bir pull request açabilir veya issue oluşturabilirsiniz.

Lisans: MIT

---

Geliştirici: [ErenEroglu61](https://github.com/ErenEroglu61)

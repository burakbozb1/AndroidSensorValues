Kod kısmındaki bazı kod parçaları Doç. Dr. Ferkan Yılmaz tarafından çıkartılmıştır. 
Kodları elde etmek için ferkan@yildiz.edu.tr a e-posta gönderiniz.


Android uygulamasını android studio idesi ile telefonunuza yükleyebilmek için öncelikle telefonunuzu debug moda getirmelisiniz. Bu işlem her cihazda farklılık gösteremektedir. Bu sebeple
telefonunuzun debug modunu nasıl aktif edebileceğinizi modeli ile birlikte internette aratarak bulabilirsiniz. Telefonunuzdan debug modu aktif ettikten sonra, telefonunuzu usb ile bilgisayarınıza bağlamalısınız.
Bu işlemden sonra ide telefonunuzu tanıyacaktır. Uygulamayı telefonunuzu seçerek başlattığınız takdirde, uygulama telefonunuza kurulacaktır.

Uygulamayı düzenli çalıştırabilmek için sunucunun aktif olması gerekmektedir. Veritabanını oluşturduktan sonra veritabanına ait bilgileri sunucu içerisinde bulunan dbConnection isimli java dosyasına girmelisiniz. 
Burada veritabanı adı, kullanıcı adı, parola, port gibi bilgiler bulunmaktadır. Bu kısımları kendi sisteminize göre doldurmalısınız. 

Veritabanını hazır hale getirip Eclipse idesine Tomcat v9 kurulduktan sonra sunucu çalıştırılabilir durumda olacaktır. Eğer sunucuyu localhost'unuzda çalıştırıyor iseniz yerel ağınızdaki ip numaranızı öğrenmelisiniz.
Windows işletim sistemi için komut ekranına "ipconfig" yazarak ip nize ulaşabilirsiniz. Android uygulaması içerisinde, MainActivity ve ValuesScreen isimli java dosyalarının içerisinde bulunan arka planda çalışmayı sağlayan
inner class lara ip numaranızı girmelisiniz. Bu sayede telefonunuz ağınızdaki doğru lokasyona istek yollayabilir.

Frameworkü matlab ve pythonda çalıştırabilmek için jar dosyasının konumunu sistemlerinize tanıtmalısınız. Matlab için;
Program Files'ınız içerisinde bulunan matlab klasörüne girin. Burada bulunan matlab versiyonunuzu gösterene klasöre girin. Sırasıyla; toolbox->local yollarını takip edin. Bu lokasyonda bulunan classpath.txt dosyasını açın.
Bu txt dosyası içerisinde yeni bir satıra jar dosyanızın konumunu ve adını belirtecek şekilde bir bilgi ekleyin (Örneğin: C:/sensors.jar). Matlabınızı yeniden başlatın ve herhangi bir nesneye "com.sensors.jar.Main" i atayın.

Frameworkü python'a tanıtmak için bilgisayar özelliklerinize girin. Sırasıyla Gelişmiş sistem ayarları -> Gelişmiş sekmesi altında bulunan Ortam Değişkenleri bölümüne girin. Açılan penceredeki kullanıcı ve sistem değişkenleri
alanına jar dosyanızı konumu ile birlikte eklemelisiniz. Her iki kısım içinde ayrı ayrı yeni butonuna tıklayın. Değişken adı için "CLASSPATH" ve değişken değeri için de jar dosyasını adresi+ismi şeklinde ekleyin (Örnek : C:/sensors.jar).
Bu işlemleri yaptıktan sonra pythondan artık framework'e erişebileceksiniz. Pythonda java classlarını kullanabilmek için farklı kütüphaneler mevcuttur. Biz projemizin geliştirme aşamasında pyjnius kütüphanesinden faydalandık.
Bu kütüphaneyi python uygulamanıza ekledikten sonra "x = autoclass('com.sensors.jar.Main')" şeklinde frameworke ulaşabilirsiniz.

Bir problemle karşılaşmanız durumunda ferkan@yildiz.edu.tr a e-posta gönderebilirsiniz.
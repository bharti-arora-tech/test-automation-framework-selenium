package utils;

import java.util.UUID;

/*
Generates random test data.
All generated values are stored in Excel.
*/

public class RandomDataGenerator {

public static String randomEmail() {

String email =
"user"+UUID.randomUUID()+"@test.com";

ExcelUtils.writeData(1,email);

return email;
}

public static String randomName() {

String name="User"+UUID.randomUUID();

ExcelUtils.writeData(2,name);

return name;
}

}

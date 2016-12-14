import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by MichaelApposing on 01/12/2016.
 */
public class PEmain3 {

    public static final String SEED_16_CHARACTER = "QXBwb3Npbmdpcw==";

    public static void main(String[] args) {
        //Problem 3
        //The prime factors of 13195 are 5, 7, 13 and 29.
        //What is the largest prime factor of the number 600851475143 ?


        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


        try {
            md.update(SEED_16_CHARACTER.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte[] mdbytes = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < mdbytes.length; i++) {
            sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
        }

        System.out.println("Hex format : " + sb.toString());

        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
        for (int i=0;i<mdbytes.length;i++) {
            hexString.append(Integer.toHexString(0xFF & mdbytes[i]));
        }

        System.out.println("Hex format : " + hexString.toString());

    }

}

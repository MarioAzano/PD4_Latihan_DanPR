
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;

public class PRSegi3Kebalik {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.print("Masukkan Angka Yang Diinginkan = ");
        n=Integer.parseInt(br.readLine());

        for (int i = 0; i <n ; i++) {
            System.out.println("");
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" * ");
            }

            }
        }

        }


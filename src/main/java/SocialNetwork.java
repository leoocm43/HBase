import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class SocialNetwork {
    public static void main(String[] args) throws IOException {

        Configuration config = HBaseConfiguration.create();
        HTable table = new HTable(config, "SocialNetworkL");

        ////User1
        Put p = new Put(Bytes.toBytes("leo"));
        p.add(Bytes.toBytes("info"), Bytes.toBytes("age"),
                Bytes.toBytes("21"));
        table.put(p);
        p.add(Bytes.toBytes("info"), Bytes.toBytes("email"),
                Bytes.toBytes("leonardo@correo.com"));
        table.put(p);
        p.add(Bytes.toBytes("info"), Bytes.toBytes("address"),
                Bytes.toBytes("address 1"));
        table.put(p);
        p.add(Bytes.toBytes("friends"), Bytes.toBytes("BFF"),
                Bytes.toBytes("oscar"));
        table.put(p);
        p.add(Bytes.toBytes("friends"), Bytes.toBytes("listOfFriends"),
                Bytes.toBytes("oscar, paco, pedro, damian, miguel, charly"));
        table.put(p);

        //User2
        Put p2 = new Put(Bytes.toBytes("oscar"));
        p2.add(Bytes.toBytes("info"), Bytes.toBytes("age"),
                Bytes.toBytes("22"));
        table.put(p2);
        p2.add(Bytes.toBytes("info"), Bytes.toBytes("email"),
                Bytes.toBytes("oscar@correo.com"));
        table.put(p2);
        p2.add(Bytes.toBytes("info"), Bytes.toBytes("address"),
                Bytes.toBytes("address 12"));
        table.put(p2);
        p2.add(Bytes.toBytes("friends"), Bytes.toBytes("BFF"),
                Bytes.toBytes("leo"));
        table.put(p2);
        p2.add(Bytes.toBytes("friends"), Bytes.toBytes("BFF"),
                Bytes.toBytes("leo, pedro, paco, damian, felipe"));
        table.put(p2);

        //User3
        Put p3 = new Put(Bytes.toBytes("miguel"));
        p3.add(Bytes.toBytes("info"), Bytes.toBytes("age"),
                Bytes.toBytes("23"));
        table.put(p3);
        p3.add(Bytes.toBytes("info"), Bytes.toBytes("email"),
                Bytes.toBytes("miguel@correo.com"));
        table.put(p3);
        p3.add(Bytes.toBytes("info"), Bytes.toBytes("address"),
                Bytes.toBytes("address 23"));
        table.put(p3);
        p3.add(Bytes.toBytes("friends"), Bytes.toBytes("BFF"),
                Bytes.toBytes("pedro"));
        table.put(p3);
        p3.add(Bytes.toBytes("friends"), Bytes.toBytes("BFF"),
                Bytes.toBytes("leo, juan, pedro, antonio"));
        table.put(p3);

        //User4

        Put p4 = new Put(Bytes.toBytes("charly"));
        p4.add(Bytes.toBytes("info"), Bytes.toBytes("age"),
                Bytes.toBytes("20"));
        table.put(p4);
        p4.add(Bytes.toBytes("info"), Bytes.toBytes("email"),
                Bytes.toBytes("charly@correo.com"));
        table.put(p4);
        p4.add(Bytes.toBytes("info"), Bytes.toBytes("address"),
                Bytes.toBytes("address 56"));
        table.put(p4);
        p4.add(Bytes.toBytes("friends"), Bytes.toBytes("BFF"),
                Bytes.toBytes("andremar"));
        table.put(p4);
        p4.add(Bytes.toBytes("friends"), Bytes.toBytes("listOfFriends"),
                Bytes.toBytes("adnremar, leo, kevin, kennet, yoshi"));
        table.put(p4);



       /* Get g = new Get(Bytes.toBytes("leo"));
        Result r = table.get(g);
        byte[] value = r.getValue(Bytes.toBytes("myLittleFamily"), Bytes.toBytes("someQualifier"));
        String valueStr = Bytes.toString(value);
        System.out.println("GET: " + valueStr);

        Scan s = new Scan();
        s.addColumn(Bytes.toBytes("myLittleFamily"), Bytes
                .toBytes("someQualifier"));

        ResultScanner scanner = table.getScanner(s);
        try {
            for (Result rr = scanner.next(); rr != null; rr = scanner.next()) {
                System.out.println("Found row: " + rr);
            }
        } finally {
            scanner.close();
        }*/
    }
}
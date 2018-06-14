package local.hal.ma42.androidjava.lesson4.asgmt;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class ShowItems {
       public static void main(String[] args) {
            Map<Integer, Item> stock = new HashMap<>();

            Item taro = new Item(1, "Info: RSSフィードのURLが変わります", "http://cgi.itmedia.co.jp/rss/ait_2.0/corp/corp/info/2018/04/16/rss-2/", "2018年4月16日までにRSSフィードをご登録いただいていた方は、6月末日までにURLをご変更ください。", Timestamp.valueOf("2018-04-16 16:00:00"));
            Item jiro = new Item(12457, "MicrosoftがGitHubを買収、「10年前には想像もしなかった」とGitHubの共同創設者", "http://cgi.itmedia.co.jp/rss/ait_2.0/atit/ait/articles/1806/05/news109.html", "Microsoftは2018年6月4日（米国時間）、開発者のためのコード共有／共同作業プラットフォームサービスを運営するGitHubを買収すると発表した。GitHubの共同創設者でCEOクリス・ワンストラス氏のコメントをまとめた。\n", Timestamp.valueOf("2018-04-16 16:00:00"));
            Item hanako = new Item(63544, "MicrosoftがGitHubを買収か？　それに対してGitLabが祝福の声明を発表", "http://cgi.itmedia.co.jp/rss/ait_2.0/atit/ait/articles/1806/05/news047.html", "Bloombergの報道によると、MicrosoftはGitHubを買収することで合意した。2018年6月4日（日本時間5日）にも買収合意が発表される可能性がある。その報道を受けて、GitLabが祝福の声明を送った。\n", Timestamp.valueOf("2018-04-16 16:00:00"));

            stock.put(46887, taro);
            stock.put(12457, jiro);
            stock.put(63544, hanako);

            System.out.println("-------- ヘッドライン ---------");
            for(Map.Entry<Integer, Item> element : stock.entrySet()) {
                Integer key = element.getKey();
                Item person = element.getValue();

                StringBuffer sbCurry = new StringBuffer();
                sbCurry.append("---------記事ID: ");
                sbCurry.append(key + "\n");
                sbCurry.append(person.getTitle() + "の提供を開始");
                sbCurry.append("[" + person.getPubDate() + "]" + "\n");
                sbCurry.append(person.getDesc() + "\n");
                sbCurry.append(person.getUrl());


                System.out.println(sbCurry.toString());
            }
        }
    }


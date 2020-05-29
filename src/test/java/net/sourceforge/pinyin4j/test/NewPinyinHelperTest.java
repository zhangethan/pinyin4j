package net.sourceforge.pinyin4j.test;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.junit.Test;

/**
 * NewPinyinHelperTest
 *
 * @author wangnan
 * @since 2020/5/29
 **/
public class NewPinyinHelperTest {


    /**
     *chūn mián bù jué xiăo ，,!@#$ chŭ chù wén tí niăo
     */
    @Test
    public void test() throws BadHanyuPinyinOutputFormatCombination {
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        format.setToneType(HanyuPinyinToneType.WITH_TONE_MARK);
        format.setVCharType(HanyuPinyinVCharType.WITH_U_UNICODE);
        String result1 = PinyinHelper.toHanYuPinyinString("你好啊", format, " ", true, true);
        System.out.println(result1);
        String result2 = PinyinHelper.toHanYuPinyinString("春眠不觉晓，,!@#$处处闻啼鸟", format, " ", true, true);
        System.out.println(result2);
        String result3 = PinyinHelper.toHanYuPinyinString("一日千里", format, " ", true, true);
        System.out.println(result3);
        String result4 = PinyinHelper.toHanYuPinyinString("大鱼吃小鱼,杨幂是个女的", format, " ", true, true);
        System.out.println(result4);
        String result5 = PinyinHelper.toHanYuPinyinString("嫲櫷", format, " ", true, true);
        System.out.println(result5);
        String result6 = PinyinHelper.toHanYuPinyinString("浅浅淡淡ω", format, " ", true, true);
        System.out.println(result6);
    }

}

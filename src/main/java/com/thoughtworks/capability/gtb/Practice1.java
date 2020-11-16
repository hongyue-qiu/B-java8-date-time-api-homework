package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.Period;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int nextYear = LocalDate.now().plusYears(1).getYear();
    LocalDate currentLaborDay = LocalDate.of(nextYear-1,5,1);
    LocalDate nextLaborDay = LocalDate.of(nextYear,5,1);
    if(date.isAfter(currentLaborDay)){
      return DAYS.between(date,nextLaborDay);
    }
    System.out.println(date);
    return DAYS.between(date,currentLaborDay);
  }
}

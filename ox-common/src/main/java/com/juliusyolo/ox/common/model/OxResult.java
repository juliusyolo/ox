package com.juliusyolo.ox.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * OxResult description
* </p>
 *
 * @author gesi.julius
 * @version : OxResult v0.1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OxResult<T> {
     public boolean success = true;

     public String message;

     public T data;

     public  static <T> OxResult<T> ok(T data){
          return new OxResult<>(true,"ok",data);
     }
}

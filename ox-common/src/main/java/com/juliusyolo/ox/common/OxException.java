package com.juliusyolo.ox.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Mono;

/**
 * @author Julius Wang
 * <p>
 * 公用异常
 * <p>
 * @since v0.1
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OxException extends RuntimeException{
    private String code;
    private String message;

    public OxException(OxStatus status) {
        this.code = status.getCode();
        this.message = status.getMessage();
    }

   public static Mono<?> error(OxStatus status){
        return Mono.error(new OxException(status));
   }
}

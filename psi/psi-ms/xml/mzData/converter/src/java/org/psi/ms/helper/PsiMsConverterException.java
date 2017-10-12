/**
 * $Id$
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Jul 23, 2003
 * Time: 5:45:33 PM
 */
package org.psi.ms.helper;

/**
 *
 * @author Kai Runte
 */
public class PsiMsConverterException extends Exception {

    public PsiMsConverterException(String message) {
        super(message);
    }

    public PsiMsConverterException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public PsiMsConverterException(Throwable throwable) {
        super(throwable);
    }

}
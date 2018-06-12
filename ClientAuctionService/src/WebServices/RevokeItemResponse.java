
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revokeItemResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revokeItemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemRevoked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revokeItemResponse", propOrder = {
    "itemRevoked"
})
public class RevokeItemResponse {

    protected boolean itemRevoked;

    /**
     * Gets the value of the itemRevoked property.
     * 
     */
    public boolean isItemRevoked() {
        return itemRevoked;
    }

    /**
     * Sets the value of the itemRevoked property.
     * 
     */
    public void setItemRevoked(boolean value) {
        this.itemRevoked = value;
    }

}

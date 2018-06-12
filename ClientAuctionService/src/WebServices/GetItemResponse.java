
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItemResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemFound" type="{http://web.auction/}item" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemResponse", propOrder = {
    "itemFound"
})
public class GetItemResponse {

    protected Item itemFound;

    /**
     * Gets the value of the itemFound property.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItemFound() {
        return itemFound;
    }

    /**
     * Sets the value of the itemFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItemFound(Item value) {
        this.itemFound = value;
    }

}

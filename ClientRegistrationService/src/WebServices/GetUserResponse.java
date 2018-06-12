
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foundUser" type="{http://web.auction/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserResponse", propOrder = {
    "foundUser"
})
public class GetUserResponse {

    protected User foundUser;

    /**
     * Gets the value of the foundUser property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getFoundUser() {
        return foundUser;
    }

    /**
     * Sets the value of the foundUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setFoundUser(User value) {
        this.foundUser = value;
    }

}

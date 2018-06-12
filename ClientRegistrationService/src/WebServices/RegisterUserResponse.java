
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userRegistered" type="{http://web.auction/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerUserResponse", propOrder = {
    "userRegistered"
})
public class RegisterUserResponse {

    protected User userRegistered;

    /**
     * Gets the value of the userRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserRegistered() {
        return userRegistered;
    }

    /**
     * Sets the value of the userRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserRegistered(User value) {
        this.userRegistered = value;
    }

}

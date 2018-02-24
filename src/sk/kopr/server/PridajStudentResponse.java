
package sk.kopr.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentUUID"
})
@XmlRootElement(name = "PridajStudentResponse")
public class PridajStudentResponse {

    @XmlElement(name = "StudentUUID", required = true)
    protected String studentUUID;

    /**
     * Gets the value of the studentUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentUUID() {
        return studentUUID;
    }

    /**
     * Sets the value of the studentUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentUUID(String value) {
        this.studentUUID = value;
    }

}

package app.<%= app %>.model.referential;

import app.<%= app %>.commun.persistence.EntityPersistListener;
import app.<%= app %>.commun.persistence.OtisEntity;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by IOS SOS TOXIC on 12/12/2016.
 */

@Entity
@NamedQuery(name = "<%= entity %>.findAll", query = "SELECT b FROM <%= entity %> b")
@Table(name = "rcafo_<%= entityName %>", schema = "referential")
@EntityListeners({EntityPersistListener.class})
@XmlRootElement
public class <%= entity %> extends OtisEntity implements Serializable {



}

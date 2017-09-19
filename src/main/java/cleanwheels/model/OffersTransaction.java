package cleanwheels.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Sarvaraj.Singh on 19-09-2017.
 */
@Entity
@Table(name = "offer_trans")
public class OffersTransaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "offer_id")
    @Size(max = 30)
    private String offerId;

    @NotNull
    @Column(name = "user_id")
    @Size(max = 30)
    private String userId;

    @NotNull
    @Column(name = "offer_code")
    @Size(max = 30)
    private String offerCode;

    @NotNull
    @Column(name = "offer_amout")
    @Size(max = 30)
    private String offerAmount;

    @NotNull
    @Column(name = "consumer_id")
    @Size(max = 30)
    private String consumerId;

    @NotNull
    @Column(name = "consumer_name")
    @Size(max = 30)
    private String consumerName;

}

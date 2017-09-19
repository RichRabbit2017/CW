package cleanwheels.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Sarvaraj.Singh on 19-09-2017.
 */
@Entity
@Table(name = "referral_trans")
public class ReferralTransaction implements Serializable {

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
    @Column(name = "consumer_id")
    @Size(max = 30)
    private String consumerId;

    @NotNull
    @Column(name = "referred_code")
    @Size(max = 30)
    private String referredCode;

    @NotNull
    @Column(name = "expiry")
    @Size(max = 30)
    private String expiry;

    @NotNull
    @Column(name = "consumed")
    @Size(max = 30)
    private String cnsumed;

    @NotNull
    @Column(name = "consumer_name")
    @Size(max = 30)
    private String consumerName;


}

package generated.com.example.flow

import javax.annotation.Generated
import org.web3j.corda.model.core.identity.Party

/**
*
* @param iouValue
* @param otherParty
*/
@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-12-20T02:08:15.113Z"
)
data class ExampleFlow_InitiatorPayload(
    val iouValue: kotlin.Int,
    val otherParty: org.web3j.corda.model.core.identity.Party
)

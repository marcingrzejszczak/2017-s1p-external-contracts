package contracts.beer.messaging

org.springframework.cloud.contract.spec.Contract.make {
	description("""
Sends a positive verification of a client

```
given:
	client is not a fraud
when:
	asks for rental history
then:
	we'll send a message with a positive verification
```

""")
	ignored()
	label 'accepted_verification'
	input {
		triggeredBy('toString()')
	}
	outputMessage {
		sentTo 'verifications'
		body([
				eligible: true
		])
	}
}

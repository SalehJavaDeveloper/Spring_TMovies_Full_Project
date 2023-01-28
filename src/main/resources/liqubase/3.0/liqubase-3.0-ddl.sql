Create Table cardtransaction(
    card_id int8 PRIMARY KEY GENERATED ALWAYS AS IDENTITY ,
    card_Number varchar(20),
    card_Holder varchar(40),
    expiration_MM varchar(10),
    expiration_YY varchar(10),
    card_CVV varchar(10),
    cash_Card int4,
    send_Time date
)
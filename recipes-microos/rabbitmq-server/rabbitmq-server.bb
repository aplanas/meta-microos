SUMMARY = "A message broker supporting AMQP, STOMP and MQTT"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging."
LICENSE = "MPL-2.0"

PV = "3.11.3"

RPM_NAME = "rabbitmq-server-3.11.3-1.3.aarch64.rpm"
RPM_HASH = "2a2c7405d19a3bb345c3e859dc6513d09cd6c61141ef0295ae109d7e2aaa1c959996bd5c85208cf415a8e207c66382e01ec6ba42be05499547339d5775ee6836"

RPROVIDES:${PN} += "AMQP-server config(rabbitmq-server) rabbitmq-server rabbitmq-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/mkdir /usr/bin/touch erlang erlang-epmd fillup logrotate rabbitmq-server-plugins shadow"

inherit rpm

SUMMARY = "Interact with RabbitMQ over AMQP using librabbitmq"
DESCRIPTION = "'Net::AMQP::RabbitMQ' provides a simple wrapper around the librabbitmq \
library that allows connecting, declaring exchanges and queues, binding and \
unbinding queues, publishing, consuming and receiving events. \
 \
Error handling in this module is primarily achieve by 'Perl_croak' (die). \
You should be making good use of 'eval' around these methods to ensure that \
you appropriately catch the errors."
LICENSE = "MPL-1.1"

PV = "2.40010"

RPM_NAME = "perl-Net-AMQP-RabbitMQ-2.40010-1.3.aarch64.rpm"
RPM_HASH = "f11aae97f6154e101e097acb06e76918998c9b0b8e41fd02241ae6f90e309304d709e0ca3a59efbebd8c4c2b1797019a98d589c24cb1bcf1566e08b2ea9f89f3"

RPROVIDES:${PN} += "perl(Net::AMQP::RabbitMQ) perl-Net-AMQP-RabbitMQ perl-Net-AMQP-RabbitMQ(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(Math::Int64)"

inherit rpm

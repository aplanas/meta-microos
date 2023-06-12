SUMMARY = "C library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "libqpid-proton11-0.38.0-1.4.aarch64.rpm"
RPM_HASH = "25ca591f7c4b0660312512e0d631f57bc45970f51ed914248ec2ffad498786b5c3d9857d3eef98f8273c21bf5b05c65980702564b41f27710274e9bf52fe0c34"

RPROVIDES:${PN} += "libqpid-proton.so.11()(64bit) \
libqpid-proton11 \
libqpid-proton11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm

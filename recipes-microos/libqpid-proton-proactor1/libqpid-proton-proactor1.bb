SUMMARY = "Proactor library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "libqpid-proton-proactor1-0.38.0-1.4.aarch64.rpm"
RPM_HASH = "a4a03dac92d527e067aecd4709d281f2147141c31a6dbec492a9651cb8c694d41834c62dbcac8ed8025d96b14b2b0067b512c9dc7ee7de8cb1ab62f88e100614"

RPROVIDES:${PN} += "libqpid-proton-proactor.so.1()(64bit) \
libqpid-proton-proactor1 \
libqpid-proton-proactor1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libqpid-proton-core.so.10()(64bit)"

inherit rpm

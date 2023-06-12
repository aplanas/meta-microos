SUMMARY = "Python language bindings for the Qpid Proton messaging framework"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "python39-python-qpid-proton-0.38.0-1.4.aarch64.rpm"
RPM_HASH = "f0be4245ac1252a39c271198a20cde763da9e3919634ba69de075784674723dd78c7adc8b04aefa19fa492ed0e4536713db22542ffa9af1fba751c144bae18e6"

RPROVIDES:${PN} += "python3.9dist(python-qpid-proton) \
python39-python-qpid-proton \
python39-python-qpid-proton(aarch-64) \
python39-qpid-proton \
python3dist(python-qpid-proton)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libqpid-proton11 \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
python(abi)"

inherit rpm

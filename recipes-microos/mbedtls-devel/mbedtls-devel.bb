SUMMARY = "Development files for mbedtls, a SSL/TLS library"
DESCRIPTION = "This subpackage contains the development files for mbedtls, \
a suite of libraries for cryptographic functions and the \
SSL/TLS protocol suite."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "mbedtls-devel-3.4.0-3.1.aarch64.rpm"
RPM_HASH = "565792270ff85eb06096c77349523c77ebf711d5783263fc6138dcd264d0a4d857f72934a622f0ec1635fe998b05cbfe3a2b98b455ad23af0c85862e2b520e59"

RPROVIDES:${PN} += "cmake(MbedTLS) \
mbedtls-devel \
mbedtls-devel(aarch-64)"
RDEPENDS:${PN} += "libmbedcrypto14 \
libmbedtls19 \
libmbedx509-5"

inherit rpm

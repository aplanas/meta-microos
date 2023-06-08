SUMMARY = "Development files for mbedtls, a SSL/TLS library"
DESCRIPTION = "This subpackage contains the development files for mbedtls, \
a suite of libraries for cryptographic functions and the \
SSL/TLS protocol suite."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "mbedtls-devel-3.4.0-2.1.aarch64.rpm"
RPM_HASH = "8434b3ee8478437cc5983a61f3236b08ab6c4f32f8d992fbf282563fdd30c6b96f4157e5a53ff92dd667a7121640003dd9d24bc2d5296771ef14ac4a6229b2b0"

RPROVIDES:${PN} += "cmake(MbedTLS) mbedtls-devel mbedtls-devel(aarch-64)"
RDEPENDS:${PN} += "libmbedcrypto14 libmbedtls19 libmbedx509-5"

inherit rpm

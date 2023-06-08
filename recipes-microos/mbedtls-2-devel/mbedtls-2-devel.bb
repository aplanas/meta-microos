SUMMARY = "Development files for mbedtls, a SSL/TLS library"
DESCRIPTION = "This subpackage contains the development files for mbedtls, \
a suite of libraries for cryptographic functions and the \
SSL/TLS protocol suite."
LICENSE = "Apache-2.0"

PV = "2.28.3"

RPM_NAME = "mbedtls-2-devel-2.28.3-2.1.aarch64.rpm"
RPM_HASH = "e3ff81233d6f8eb3e800ba67a6550418cba5745b94d8002bccd38e35a58486941e6ce3009475667b4dea2f8f9569e27df261e5c83f07b12ca4379f5003ba9cad"

RPROVIDES:${PN} += "mbedtls-2-devel mbedtls-2-devel(aarch-64) mbedtls-devel"
RDEPENDS:${PN} += "libmbedcrypto7 libmbedtls14 libmbedx509-1"

inherit rpm

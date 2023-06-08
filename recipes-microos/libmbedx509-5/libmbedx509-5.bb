SUMMARY = "Library to work with X.509 certificates"
DESCRIPTION = "This subpackage of mbedtls contains a library that can read, verify \
and write X.509 certificates, read/write Certificate Signing Requests \
and read Certificate Revocation Lists."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "libmbedx509-5-3.4.0-2.1.aarch64.rpm"
RPM_HASH = "b7b22128ac4abc6a30a9c94be5e7d2b75383566087015d9d83fff76bdfeca7a27a742d40139ab7cacb6a0a5c56507acee8c16ce81448e19018a11765630a1438"

RPROVIDES:${PN} += "libmbedx509-5 libmbedx509-5(aarch-64) libmbedx509.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libmbedcrypto.so.14()(64bit)"

inherit rpm

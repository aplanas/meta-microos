SUMMARY = "Header files for the Key Management Interoperability Protocol library"
DESCRIPTION = "libkmip is an ISO C11 implementation of the Key Management \
Interoperability Protocol (KMIP), an OASIS communication standard \
for the management of objects stored and maintained by key \
management systems. \
 \
This package contains the development headers and libraries."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "libkmip-devel-0.2.0-1.8.aarch64.rpm"
RPM_HASH = "50d15dcb7950604009046a35859c3cde1e5d62d4ddb6bee969e000698483941ac85f4f7196cf740b0cac7a2e7ed9ccdd4db197429fffd5b76129c41dd5de0dd2"

RPROVIDES:${PN} += "libkmip-devel libkmip-devel(aarch-64)"
RDEPENDS:${PN} += "libkmip0"

inherit rpm

SUMMARY = "Freebl library checksums for the Network Security Services"
DESCRIPTION = "Checksums for libraries contained in the libfreebl3 package \
used in the FIPS 140-2 mode."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "libfreebl3-hmac-3.89-1.1.aarch64.rpm"
RPM_HASH = "5e4baf28777282aa6c0f7bee6d7b9cad0ce4c6d7500e085e12e784b0080bf22358515df91c774cbca0a93005d7f3f55265985ab2bdcad0dfa756e0f681ab0381"

RPROVIDES:${PN} += "libfreebl3-hmac libfreebl3-hmac(aarch-64)"
RDEPENDS:${PN} += "libfreebl3"

inherit rpm

SUMMARY = "Library for identification using RSA Blind Signatures"
DESCRIPTION = "A library for user identification using RSA blind signatures."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "libd0_rijndael0-1.0-3.12.aarch64.rpm"
RPM_HASH = "d63ce735dfccf8987c2257b9487d4e3c58b31f6270fb0fdde412c63ca84115118fa8deccdfe2605bb7dce92a86f97748be208149b4789e88a374e5cc03efacaa"

RPROVIDES:${PN} += "libd0_rijndael.so.0()(64bit) libd0_rijndael0 libd0_rijndael0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm

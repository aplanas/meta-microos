SUMMARY = "Library for identification using RSA Blind Signatures"
DESCRIPTION = "A library for user identification using RSA blind signatures."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "libd0_blind_id0-1.0-3.12.aarch64.rpm"
RPM_HASH = "dabb41ec0cbf9307786b2c44c37857f719c17719bae1f2eb86910df9b0cd376c3e386602dceb5cefc837bc03de16cd473452f247ff59396508318788740a771a"

RPROVIDES:${PN} += "libd0_blind_id.so.0()(64bit) libd0_blind_id0 libd0_blind_id0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit)"

inherit rpm

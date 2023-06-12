SUMMARY = "Link Layer Discovery Protocol (LLDP) libraries"
DESCRIPTION = "This package contains the Link Layer Discovery Protocol (LLDP) libraries"
LICENSE = "GPL-2.0-only"

PV = "1.1+58.8ca361bab766"

RPM_NAME = "liblldp_clif1-1.1+58.8ca361bab766-1.3.aarch64.rpm"
RPM_HASH = "24df8405185df14c8578916184305805661700743756f2533828dab68cc064f67ea18909dcdec77f423e61838179e20b1ce8991558818435d20b90c6c87a7c1d"

RPROVIDES:${PN} += "liblldp_clif.so.1()(64bit) \
liblldp_clif1 \
liblldp_clif1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

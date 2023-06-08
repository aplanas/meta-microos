SUMMARY = "Kana–Kanji conversion engine"
DESCRIPTION = "A Kana–Kanji conversion engine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "9100h"

RPM_NAME = "libanthy0-9100h-41.9.aarch64.rpm"
RPM_HASH = "7cb44dd2d86f81ad94f9593e72c65b76ac5c351baf0baf89399d5833bacfb1578ac0a28b1a63944ed06562fe72d8e04532aea47be9f23d45ca55d5c561f215d0"

RPROVIDES:${PN} += "libanthy.so.0()(64bit) libanthy0 libanthy0(aarch-64) libanthydic.so.0()(64bit) libanthyinput.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

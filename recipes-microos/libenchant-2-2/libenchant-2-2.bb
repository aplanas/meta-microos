SUMMARY = "Generic Spell Checking Library"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "libenchant-2-2-2.2.15-3.3.aarch64.rpm"
RPM_HASH = "21b5dec42c8263260a8771e7f87f4f2b366283ed7f3e6950a31df700857d64eadde9b39c48c7508d06160b8812cde4d455c6590f3d7713c854ade3658c114a1c"

RPROVIDES:${PN} += "libenchant-2-2 libenchant-2-2(aarch-64) libenchant-2.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig enchant-2-backend enchant-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit)"

inherit rpm

SUMMARY = "File viewer and pager"
DESCRIPTION = "Most is a paging program. \
It supports multiple windows and can scroll left and right."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "most-5.2.0-1.5.aarch64.rpm"
RPM_HASH = "6db556a8535dc8dc7126361aeeab67a387f7c0ea91e6ab869944cb507148d4955f3cb3fc7561d23c5123b05dbd2fd9348db84243706a526416344a204e01d3c1"

RPROVIDES:${PN} += "most most(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libslang.so.2()(64bit) libslang.so.2(SLANG2)(64bit)"

inherit rpm

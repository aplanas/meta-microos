SUMMARY = "A PDF library extracted from TeX's dvipdfmx"
DESCRIPTION = "A PDF library extracted from TeX's dvipdfmx. Used in software such as SILE. \
This package contains the shared library for libtexpdf."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.9"

RPM_NAME = "libtexpdf0-0.14.9-1.2.aarch64.rpm"
RPM_HASH = "94313a3aaa6677789384f77f114154668847faf2bc2f840da57ca19a51b92bb337dafb0f6dcf79089789188fe13d0039a99a9bd20110f1a98f4e872870163a44"

RPROVIDES:${PN} += "libtexpdf.so.0()(64bit) libtexpdf0 libtexpdf0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libz.so.1()(64bit)"

inherit rpm

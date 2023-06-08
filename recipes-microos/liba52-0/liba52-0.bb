SUMMARY = "ATSC A/52 stream decoder library"
DESCRIPTION = "liba52 is a library for decoding ATSC A/52 streams. \
Shared library part of a52dec."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.5+svn613"

RPM_NAME = "liba52-0-0.7.5+svn613-3.16.aarch64.rpm"
RPM_HASH = "d3e1cea26db6385c22408b4e7636d95fd8ddfdd5979f5ce14577eaf580c60d6ccf44fbd9506f348379e7789572a5a65b876776b73ed562a3d2e3eb3ca8ddf7f6"

RPROVIDES:${PN} += "liba52 liba52-0 liba52-0(aarch-64) liba52.so.0()(64bit) liba52dec0"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm

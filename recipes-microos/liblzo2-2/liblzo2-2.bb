SUMMARY = "A Real-Time Data Compression Library"
DESCRIPTION = "LZO is a portable lossless data compression library written in ANSI C. \
Decompression requires no memory. LZO is suitable for data compression \
and decompression in real-time. This means it favors speed over \
compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "liblzo2-2-2.10-8.2.aarch64.rpm"
RPM_HASH = "be168bb542731f0495883f0bac5ba59325b2916e37a7ed7ac2956fe27f15e7c18334d61dbc541c2a9f97544cbc276471b8e83b21069e9b2db44dcaf5ee56ba2e"

RPROVIDES:${PN} += "liblzo2-2 liblzo2-2(aarch-64) liblzo2.so.2()(64bit) lzo"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

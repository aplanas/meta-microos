SUMMARY = "Compressor with Burrows–Wheeler transform and PPM context modeling"
DESCRIPTION = "A compressor featuring improved compression ratios and performance \
over bzip2 thanks to a order-0 context mixing entropy coder, a \
Burrows-Wheeler transform code making use of suffix arrays, a RLE \
with Lempel Ziv+Prediction pass based on LZ77-style string matching \
and PPM-style context modeling."
LICENSE = "LGPL-3.0-or-later & BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "libbzip3-0-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "553bd3148e71168c9e752c1587caa82b3e5f1354910437f996caa475ac1a7eb585df9c4915c68565d2831391ff8f3b15ffc508c08adccf90bc1837c5fded6f20"

RPROVIDES:${PN} += "libbzip3-0 libbzip3-0(aarch-64) libbzip3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

SUMMARY = "Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
This subpackage contains the implementation as a shared library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "libzstd1-1.5.5-1.1.aarch64.rpm"
RPM_HASH = "60f2bf5aeb11453e9fc7f146daac3f32c39d3a7be1370f7a18450edd8c26248288d9b71bbd1a4a8f2a12bf3b56f81389a83da2554df1d8e3c59f8e3edee2c889"

RPROVIDES:${PN} += "libzstd.so.1()(64bit) libzstd1 libzstd1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

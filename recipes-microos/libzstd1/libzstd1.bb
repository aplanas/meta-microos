SUMMARY = "Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
This subpackage contains the implementation as a shared library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "libzstd1-1.5.5-3.1.aarch64.rpm"
RPM_HASH = "3385ed0efbb9ac77f7c873a37ae82021ca9378aaf05db9ea8efb3c9d2323e9a00fb0b6d6ef08094299ab76145a1df414fa3893ea90947a1065c2082ae5de186e"

RPROVIDES:${PN} += "libzstd.so.1()(64bit) libzstd1 libzstd1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

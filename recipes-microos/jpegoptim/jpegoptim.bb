SUMMARY = "Utility for Optimizing JPEG Files"
DESCRIPTION = "jpegoptim is a utility for optimizing JPEG files. It provides lossless \
optimization (based on optimizing the Huffman tables) and 'lossy' optimization \
based on setting a maximum quality factor."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.3"

RPM_NAME = "jpegoptim-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "decf336e1d86161be85eb3535fbf29e93670d984005c17e0aa4a08797410bc30bfeb51d58d98e21b04f4890cea52b7c561045e3013b6bd66b374be7d5b554107"

RPROVIDES:${PN} += "jpegoptim jpegoptim(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit)"

inherit rpm

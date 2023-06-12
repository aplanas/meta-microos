SUMMARY = "Recover data from a corrupted gzip file"
DESCRIPTION = "gzrecover is a program that will attempt to extract any readable data \
out of a gzip file that has been corrupted."
LICENSE = "GPL-2.0-only"

PV = "0.8"

RPM_NAME = "gzrt-0.8-2.13.aarch64.rpm"
RPM_HASH = "1d45ab446a9dad7efc0626e6298d983681de263b81be3bd376f355e8b1fbf57e0f760212f23cb328b636fb3386475d3e8d32f0aa1bd5fb0c87c7d3927767c91e"

RPROVIDES:${PN} += "gzrt \
gzrt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit)"

inherit rpm

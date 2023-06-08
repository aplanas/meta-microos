SUMMARY = "MPEG audio decoder library"
DESCRIPTION = "MPEG 1.0/2.0/2.5 audio decoder library for layers 1, 2 and 3 (most \
commonly MPEG 1.0 Layer 3 aka MP3)."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "libmpg123-0-1.31.3-1.2.aarch64.rpm"
RPM_HASH = "60817d08fe9ceb3707d94f87af00a17ea9687c6cccc3070f4822438a6832f00ce045d331591e78aff73b7b4b10de8e0b3c466dcf6719290499c3ddd42fcfdc19"

RPROVIDES:${PN} += "libmpg123-0 libmpg123-0(aarch-64) libmpg123.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

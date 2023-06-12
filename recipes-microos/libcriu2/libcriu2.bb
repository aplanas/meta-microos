SUMMARY = "Library for CRIU"
DESCRIPTION = "This package contains the library for CRIU, Checkpoint/Restore In \
Userspace Tools."
LICENSE = "LGPL-2.1-only"

PV = "3.17.1"

RPM_NAME = "libcriu2-3.17.1-3.5.aarch64.rpm"
RPM_HASH = "650f12e45161ab9f4df64b03a1ec99176f4ce8e39efa4bf690b4c81198b77277f81daf704ce051df8a24f9174fc18488a87947da5fb81e43e522b25ac6af5258"

RPROVIDES:${PN} += "libcriu.so.2()(64bit) \
libcriu2 \
libcriu2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libprotobuf-c.so.1()(64bit) \
libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit)"

inherit rpm

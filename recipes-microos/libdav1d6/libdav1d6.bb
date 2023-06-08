SUMMARY = "AV1 decoder library"
DESCRIPTION = "dav1d is an AV1 decoder library."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "libdav1d6-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "c26b5c53f57c82c02b5a4be4dadb55b39e0e4f7217c6148f86da126f34286dc87bb4a5ac179d28623ac6eead7d7aeb041d409c92249257127a2f685e3f1306cd"

RPROVIDES:${PN} += "libdav1d.so.6()(64bit) libdav1d6 libdav1d6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

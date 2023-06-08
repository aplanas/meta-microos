SUMMARY = "A light-weight C library for loading PNG images"
DESCRIPTION = "pnglite is a C library for loading PNG images. It was created as a \
substitute for libpng in situations when libpng is more than enough. It \
currently requires zlib for inflate and CRC checking and it can read the \
most common types of PNG images. The library has a small and simple to use \
interface."
LICENSE = "Zlib"

PV = "0.1.17"

RPM_NAME = "libpnglite0-0.1.17-1.23.aarch64.rpm"
RPM_HASH = "27bcec14940f68c9826a82c9763a608cb3495c06723c0de9edf5dba694034037a75d9dca885de166e5d8fe2570674ea7fb2a73c80a718132e476eec7765b992d"

RPROVIDES:${PN} += "libpnglite.so.0()(64bit) libpnglite0 libpnglite0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

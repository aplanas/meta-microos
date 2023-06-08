SUMMARY = "C library for encoding, decoding and manipulating JSON data"
DESCRIPTION = "Jansson is a C library for encoding, decoding and manipulating JSON data. \
It features: \
 * Simple and intuitive API and data model \
 * Comprehensive documentation \
 * No dependencies on other libraries \
 * Full Unicode support (UTF-8) \
 * Extensive test suite"
LICENSE = "MIT"

PV = "2.14"

RPM_NAME = "libjansson4-2.14-1.7.aarch64.rpm"
RPM_HASH = "509f5f1dfff93c9a51eebc5d9c6d5993f00eda3c9992558986d54cac4b48167ab69b3376a2b77d44fa5edb512d0df902d778621bd5f9d22bf59209753e6d5cbb"

RPROVIDES:${PN} += "libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libjansson4 libjansson4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

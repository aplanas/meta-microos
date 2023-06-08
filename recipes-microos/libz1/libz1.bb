SUMMARY = "Library implementing the DEFLATE compression algorithm"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "libz1-1.2.13-4.1.aarch64.rpm"
RPM_HASH = "ca746432b97404aff44910d02d28b80952ff50fcb3eaf6e0245c84d76d21a1114767ecc1af1ca626fe6418d94fdbc1bd1c80dd790acb50282fd832eb2d092642"

RPROVIDES:${PN} += "libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libz.so.1(ZLIB_1.2.0.2)(64bit) libz.so.1(ZLIB_1.2.0.8)(64bit) libz.so.1(ZLIB_1.2.12)(64bit) libz.so.1(ZLIB_1.2.2)(64bit) libz.so.1(ZLIB_1.2.2.3)(64bit) libz.so.1(ZLIB_1.2.2.4)(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) libz.so.1(ZLIB_1.2.3.4)(64bit) libz.so.1(ZLIB_1.2.3.5)(64bit) libz.so.1(ZLIB_1.2.5.1)(64bit) libz.so.1(ZLIB_1.2.5.2)(64bit) libz.so.1(ZLIB_1.2.7.1)(64bit) libz.so.1(ZLIB_1.2.9)(64bit) libz1 libz1(aarch-64) zlib"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

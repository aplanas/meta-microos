SUMMARY = "Library for Brotli Compression"
DESCRIPTION = "Compression library for the Brotli general purpose lossless data \
compression algorithm. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libbrotlienc1-1.0.9-3.3.aarch64.rpm"
RPM_HASH = "8643297450e3ba154a1f6addc4b29850c2fda31c5808a1db0c00841bb00c97a18bef488a8b62b4b3ceabb38dbcd74c03805959cd00264130365d1394969e3889"

RPROVIDES:${PN} += "libbrotlienc.so.1()(64bit) \
libbrotlienc1 \
libbrotlienc1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libbrotlicommon.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

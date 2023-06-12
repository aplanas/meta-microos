SUMMARY = "Video CD (VCD) authoring software"
DESCRIPTION = "GNU VCDImager is a full-featured mastering suite for authoring, \
disassembling and analyzing Video CDs and Super Video CDs. \
This is the core library"
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "libvcdinfo0-2.0.1-3.11.aarch64.rpm"
RPM_HASH = "e2f1e18822c7f6b45647b7865decd5adf6692cee1928bc47cf8ee6af4cd25d441dc270b32c5b8a83269dbdbd5ef0c4f9ce03c7c23a46d3c55ab93ae3eb11bd83"

RPROVIDES:${PN} += "libvcdinfo.so.0()(64bit) \
libvcdinfo.so.0(VCDINFO_0)(64bit) \
libvcdinfo0 \
libvcdinfo0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libiso9660.so.11()(64bit) \
libiso9660.so.11(ISO9660_11)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm

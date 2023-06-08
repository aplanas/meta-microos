SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libswscale5_9-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "850426d5788435ad4e2406f8170c0e1961c5bf1ef006c51ea28a6cb4c407efcc033223fbfef5670a607bf7781041c54c30997dee1b363590cc2b08a0c0dd460a"

RPROVIDES:${PN} += "libswscale.so.5.9()(64bit) libswscale.so.5.9(LIBSWSCALE_5)(64bit) libswscale5_9 libswscale5_9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libavutil56_70 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

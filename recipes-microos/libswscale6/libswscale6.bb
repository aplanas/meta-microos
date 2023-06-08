SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libswscale6-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "7ff23b5c2817938cc38197469acb981c533aebd7f62f01c4f6d1c51befb7dfaa0cafbf420ffac02c11f9512b29bd6e262a275be0535bf845c6db29f90bd425b6"

RPROVIDES:${PN} += "libswscale.so.6()(64bit) libswscale.so.6(LIBSWSCALE_6.7_SUSE)(64bit) libswscale6 libswscale6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libavutil57 libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

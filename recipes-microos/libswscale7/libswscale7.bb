SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libswscale7-6.0-2.1.aarch64.rpm"
RPM_HASH = "8956d956a7215c55e974b12ab6bcb36be3bb96e29dcdae8e9102187be8803610264991184f1cac15ebd7d6fc908e3e7ad789dda1274d510fc78e5ba379a45fbe"

RPROVIDES:${PN} += "libswscale.so.7()(64bit) libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) libswscale7 libswscale7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libavutil58 libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

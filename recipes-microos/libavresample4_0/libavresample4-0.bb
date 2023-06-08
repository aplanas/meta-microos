SUMMARY = "FFmpeg alternate audio resampling library"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavresample4_0-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "362caf6cd488d57aa63b18a69caaf072865f278f2cf3904ef74f2dc0fba83a55f29a7a76b29dd89cc02177353105713a28198ec75de0e5d1dfdf90001488c91a"

RPROVIDES:${PN} += "libavresample.so.4.0()(64bit) libavresample.so.4.0(LIBAVRESAMPLE_4)(64bit) libavresample4 libavresample4_0 libavresample4_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libavutil56_70 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm

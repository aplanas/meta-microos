SUMMARY = "FFmpeg alternate audio resampling library"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavresample4_0-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "0e581a516f6e907bf1a5577ec3524e3fe4929c23d2f92b3daa53f662e7016f81e0b79039840dbbc7d8be913408f612e147140e26a22d7303ac605aecd574ab73"

RPROVIDES:${PN} += "libavresample.so.4.0()(64bit) \
libavresample.so.4.0(LIBAVRESAMPLE_4)(64bit) \
libavresample4 \
libavresample4_0 \
libavresample4_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libavutil56_70 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm

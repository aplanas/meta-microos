SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libpostproc55_9-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "1957dd306cb48da466efc1f315bcabac72f5e1c0fee3e8c65ccfaeab2220762eca9697a01615b7b07634783a09736aefb781b0b2a771a575bec2239227cc4590"

RPROVIDES:${PN} += "libpostproc.so.55.9()(64bit) \
libpostproc.so.55.9(LIBPOSTPROC_55)(64bit) \
libpostproc55_9 \
libpostproc55_9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libavutil56_70 \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

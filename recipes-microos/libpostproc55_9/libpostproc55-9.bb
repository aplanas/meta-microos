SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libpostproc55_9-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "5dfe1fc0fca9d6ceb2a25be95c1276e6934763d68c381da3b66d1a7576cdd89c64ebb490f5b0acd7e5c020e4a70d17d49174b5bb00c9a765ffab4c34a557582b"

RPROVIDES:${PN} += "libpostproc.so.55.9()(64bit) libpostproc.so.55.9(LIBPOSTPROC_55)(64bit) libpostproc55_9 libpostproc55_9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libavutil56_70 libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

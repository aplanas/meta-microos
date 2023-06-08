SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libpostproc56-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "db609adac49b9bccc84969e4747077dd1d5d2d330a58e1f8e1ef6f4377cc118a48f12b863bc0a068398cf56bba2374f01358fe5a1dc86311bfe9a6962b7b1541"

RPROVIDES:${PN} += "libpostproc.so.56()(64bit) libpostproc.so.56(LIBPOSTPROC_56.6_SUSE)(64bit) libpostproc56 libpostproc56(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libavutil57 libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

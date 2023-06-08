SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmjpegutils-2_2-0-2.2.1-2.5.aarch64.rpm"
RPM_HASH = "b3f73b36feadbe1260a17fdf31a964bb5bd0a212201794c871890d6db7029dfbadb16adda8626a2df96aa9ce17618bcf66f9101677345659b7cd37657c3a0fe4"

RPROVIDES:${PN} += "libmjpegutils-2.2.so.0()(64bit) libmjpegutils-2_2-0 libmjpegutils-2_2-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

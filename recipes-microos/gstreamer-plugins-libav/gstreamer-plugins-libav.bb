SUMMARY = "A ffmpeg/libav plugin for GStreamer"
DESCRIPTION = "GStreamer is a streaming media framework, based on graphs of filters which \
operate on media data. Applications using this library can do anything \
from real-time sound processing to playing videos, and just about anything \
else media-related. Its plugin-based architecture means that new data \
types or processing capabilities can be added simply by installing new \
plug-ins. \
 \
This plugin contains the FFmpeg codecs, containing codecs for most popular \
multimedia formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-libav-1.22.2-1.2.aarch64.rpm"
RPM_HASH = "806cfee193fef02888d90a7425c341f38886c2b211807bf437acf319af527662e2cc917f75a8336f4e138d85196ebb3dff55309d2d790101ea8abbd66a421b5c"

RPROVIDES:${PN} += "gstreamer-plugins-libav gstreamer-plugins-libav(aarch-64) gstreamer1(element-avdeinterlace)()(64bit) libgstlibav.so()(64bit)"
RDEPENDS:${PN} += "gstreamer ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavfilter.so.9()(64bit) libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) libavformat.so.60()(64bit) libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit)"

inherit rpm

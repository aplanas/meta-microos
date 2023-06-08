SUMMARY = "Development files for the GStreamer-based RTSP server library"
DESCRIPTION = "Development files for the GStreamer library for building an RTSP server."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-rtsp-server-devel-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "2acef6a189c1b53b90aa2833acca8194ec698a40de81cf2b6419b26e433ed28f09b68923c0abc94346bd57545f9c2c99d1b239a4e8b63741115fe3d9007dfb87"

RPROVIDES:${PN} += "gst-rtsp-server-devel gstreamer-rtsp-server-devel gstreamer-rtsp-server-devel(aarch-64) gstreamer1(element-rtspclientsink)()(64bit) gstreamer1(urisink-rtsp)()(64bit) gstreamer1(urisink-rtsp-sdp)()(64bit) gstreamer1(urisink-rtsph)()(64bit) gstreamer1(urisink-rtsps)()(64bit) gstreamer1(urisink-rtspsh)()(64bit) gstreamer1(urisink-rtspst)()(64bit) gstreamer1(urisink-rtspsu)()(64bit) gstreamer1(urisink-rtspt)()(64bit) gstreamer1(urisink-rtspu)()(64bit) libgstrtspclientsink.so()(64bit) pkgconfig(gstreamer-rtsp-server-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstrtsp-1.0.so.0()(64bit) libgstrtspserver-1.0.so.0()(64bit) libgstrtspserver-1_0-0 libgstsdp-1.0.so.0()(64bit) pkgconfig(gstreamer-1.0) pkgconfig(gstreamer-app-1.0) pkgconfig(gstreamer-net-1.0) pkgconfig(gstreamer-rtp-1.0) pkgconfig(gstreamer-rtsp-1.0) pkgconfig(gstreamer-sdp-1.0) typelib-1_0-GstRtspServer-1_0"

inherit rpm

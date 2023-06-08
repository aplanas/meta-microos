SUMMARY = "GStreamer-based RTSP server library"
DESCRIPTION = "Library on top of GStreamer for building an RTSP server - Library files."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.2"

RPM_NAME = "libgstrtspserver-1_0-0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "2d29537d8159625481d88f2d418c990f5a5e43f09c3a11dc22d996d8e074d80bd9fb6bf6d12299e0d41d6986252ac4253ce20c958d97861f57433b1a5f2d7cae"

RPROVIDES:${PN} += "libgstrtspserver-1.0.so.0()(64bit) libgstrtspserver-1_0-0 libgstrtspserver-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstnet-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstrtp-1.0.so.0()(64bit) libgstrtsp-1.0.so.0()(64bit) libgstsdp-1.0.so.0()(64bit)"

inherit rpm

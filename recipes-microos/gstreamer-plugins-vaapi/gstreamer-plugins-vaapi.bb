SUMMARY = "Gstreamer VA-API plugins"
DESCRIPTION = "gstreamer-vaapi is a collection of GStreamer plugins and helper \
libraries that allow hardware accelerated video decoding through \
VA-API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-vaapi-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "7f437db91c03849b095d77d49beb1c8aee6239a3a3dbaa323caec0dee7a7f91fa574450e1b1bc7ba55984f641354ae969d42df6f2c9cac9fbf0e327a25a5d2db"

RPROVIDES:${PN} += "gstreamer-plugins-vaapi gstreamer-plugins-vaapi(aarch-64) libgstvaapi.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGL.so.1()(64bit) libGLESv2.so.2()(64bit) libOpenGL.so.0()(64bit) libX11.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstallocators-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstcodecparsers-1.0.so.0()(64bit) libgstgl-1.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libva-drm.so.2()(64bit) libva-wayland.so.2()(64bit) libva-x11.so.2()(64bit) libva.so.2()(64bit) libva.so.2(VA_API_0.33.0)(64bit) libwayland-client.so.0()(64bit)"

inherit rpm

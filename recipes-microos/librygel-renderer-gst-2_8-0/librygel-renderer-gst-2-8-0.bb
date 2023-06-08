SUMMARY = "Gstreamer render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-renderer-gst-2_8-0-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "03349cf8e4e7b1df99008e7b7f0ac767e6b92d5663852a81b16225c4a1165e51d0b9441093bf93361ad2ddd0b37719a4559accec294b200601cff4085678c3ff"

RPROVIDES:${PN} += "librygel-renderer-gst-2.8.so.0()(64bit) librygel-renderer-gst-2_8-0 librygel-renderer-gst-2_8-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgupnp-av-1.0.so.3()(64bit) librygel-core-2.8.so.0()(64bit) librygel-renderer-2.8.so.0()(64bit)"

inherit rpm

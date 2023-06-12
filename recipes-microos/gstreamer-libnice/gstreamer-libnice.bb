SUMMARY = "GStreamer plugin for the Interactive Connectivity Establishment"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.21"

RPM_NAME = "gstreamer-libnice-0.1.21-2.1.aarch64.rpm"
RPM_HASH = "e4a9f1f61a61886d88fc3956af562315611f52ff631a73ec82190e9af2691e379f35729dcde9e8ca61fb2f80dd8a63ee580c5d6e7f305db0d41091c1c9d9e8ce"

RPROVIDES:${PN} += "gstreamer-libnice \
gstreamer-libnice(aarch-64) \
gstreamer1(element-nicesink)()(64bit) \
gstreamer1(element-nicesrc)()(64bit) \
libgstnice.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libnice.so.10()(64bit)"

inherit rpm

SUMMARY = "GStreamer Clutter Plug-In"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
This plug-in for GStreamer contains elements to render to Clutter \
textures."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "gstreamer-plugin-cluttergst3-3.0.27-2.4.aarch64.rpm"
RPM_HASH = "fa176f299a0cfc8fe7a8a8c7d428d1c493385b6f89a8021ae5a63272ba26665926d049d35701cd8e2cca24787436a4d5ff5fd17d8c368df0c318953cc8b202e3"

RPROVIDES:${PN} += "gstreamer-plugin-cluttergst3 gstreamer-plugin-cluttergst3(aarch-64) libcluttergst3.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libclutter-1.0.so.0()(64bit) libclutter-gst-3.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm

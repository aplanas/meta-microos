SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "python310-gst-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "a17eb2805ad0568b4bc51e0c22d8c1b1f7840791ee2dd31e787fbf1f9bd5d6fc7133dae67ff1ccf3c137c647e17d664968f67002dbb7a6d190e84c2a4350204c"

RPROVIDES:${PN} += "python3-gst python310-gst python310-gst(aarch-64)"
RDEPENDS:${PN} += "gstreamer ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libpython3.10.so.1.0()(64bit) python(abi) typelib(GLib) typelib(Gst) typelib(GstAudio) typelib(GstPbutils) typelib(GstVideo)"

inherit rpm

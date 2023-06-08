SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "python311-gst-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "b316c39a5db4ee4dba9d73f26f10f3591425c3ce754860bb8c3dae3cc5d039af132f5cc81160c9c26cfc56ec4c46ffe62d3a783757f18ac1e7f418db924ec1db"

RPROVIDES:${PN} += "python311-gst python311-gst(aarch-64)"
RDEPENDS:${PN} += "gstreamer ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libpython3.11.so.1.0()(64bit) python(abi) typelib(GLib) typelib(Gst) typelib(GstAudio) typelib(GstPbutils) typelib(GstVideo)"

inherit rpm

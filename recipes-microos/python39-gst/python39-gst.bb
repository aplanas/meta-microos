SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "python39-gst-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "3ac0e6f94d3465847ffe7c3e14ee2f6177082bc9e20d74401cac7f32c78b079f7bb8ab408b326956c20ae1f5aff07900bf416a7ad5ab49fcb7816d541cb748ea"

RPROVIDES:${PN} += "python39-gst python39-gst(aarch-64)"
RDEPENDS:${PN} += "gstreamer ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libpython3.9.so.1.0()(64bit) python(abi) typelib(GLib) typelib(Gst) typelib(GstAudio) typelib(GstPbutils) typelib(GstVideo)"

inherit rpm

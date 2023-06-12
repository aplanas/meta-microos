SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "python311-gst-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "69ed4b3bcc3a6708a9a2e75d6e5585de1776d5a3ee66c834698047126b8596f65bbb481f4dc8f3cacd2b7d7b406325a8a8af1228a4fe5fb685a563ddacb7fbfb"

RPROVIDES:${PN} += "python311-gst python311-gst(aarch-64)"
RDEPENDS:${PN} += "gstreamer ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libpython3.11.so.1.0()(64bit) python(abi) typelib(GLib) typelib(Gst) typelib(GstAudio) typelib(GstPbutils) typelib(GstVideo)"

inherit rpm

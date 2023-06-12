SUMMARY = "Streaming-Media Framework Runtime -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins. \
 \
This package provides the GObject Introspection bindings for GStreamer."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-Gst-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "a0644102f75652200b1e96cfe76eee273f7618212cd31c975260a663690c074c7cb8242edd180459d3d3b8b9139de9346e492c9543c6682eb1f11b408e735955"

RPROVIDES:${PN} += "typelib(Gst) typelib(GstBase) typelib(GstCheck) typelib(GstController) typelib(GstNet) typelib-1_0-Gst-1_0 typelib-1_0-Gst-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstbase-1.0.so.0()(64bit) libgstcheck-1.0.so.0()(64bit) libgstcontroller-1.0.so.0()(64bit) libgstnet-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio)"

inherit rpm

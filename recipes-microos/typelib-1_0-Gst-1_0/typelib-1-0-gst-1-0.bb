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

PV = "1.22.2"

RPM_NAME = "typelib-1_0-Gst-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "1daf5ba4eb29ace36e48a497f901390fe5f8646487669a019d90fa7d9c18ba16937dba1e7c962f9c8572940e57ec8f08f673ba01a49192c4aef11f6217fd5618"

RPROVIDES:${PN} += "typelib(Gst) typelib(GstBase) typelib(GstCheck) typelib(GstController) typelib(GstNet) typelib-1_0-Gst-1_0 typelib-1_0-Gst-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstbase-1.0.so.0()(64bit) libgstcheck-1.0.so.0()(64bit) libgstcontroller-1.0.so.0()(64bit) libgstnet-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio)"

inherit rpm

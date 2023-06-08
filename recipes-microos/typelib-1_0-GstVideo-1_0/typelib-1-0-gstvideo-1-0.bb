SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins. \
 \
This package provides the GObject Introspection bindings for GStreamer \
plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstVideo-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "e206987f8fe5e587696e218642acb6574cba358687df437d05a8e290e8818696c59eda5ed7121a404eafa68e4b251f37d273873b4811306fc9368d80f377dd6c"

RPROVIDES:${PN} += "typelib(GstVideo) typelib-1_0-GstVideo-1_0 typelib-1_0-GstVideo-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstvideo-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase)"

inherit rpm

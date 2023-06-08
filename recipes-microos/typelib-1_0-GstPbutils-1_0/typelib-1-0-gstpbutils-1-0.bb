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

RPM_NAME = "typelib-1_0-GstPbutils-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "68dd7dfb95a955b1d69378404e6bf7e52c565bbf984b99756d5e0cc92fa2b868e47c0fa781a2ae098a3a1d39132f3325f2ecdc8347c1c13cc90b47b185d9b8de"

RPROVIDES:${PN} += "typelib(GstPbutils) typelib-1_0-GstPbutils-1_0 typelib-1_0-GstPbutils-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstpbutils-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstAudio) typelib(GstBase) typelib(GstVideo)"

inherit rpm

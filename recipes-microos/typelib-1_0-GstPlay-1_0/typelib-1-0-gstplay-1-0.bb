SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstPlay-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "0b534f6b1e5dc233be1b3ee0a2907ed4c098b4167abdebfc98807b805b1daa1c1a35079183213393c523790127e8cb076acb18af3d5e54c160f733fbd49ea3ae"

RPROVIDES:${PN} += "typelib(GstPlay) typelib-1_0-GstPlay-1_0 typelib-1_0-GstPlay-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstplay-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstAudio) typelib(GstBase) typelib(GstPbutils) typelib(GstTag) typelib(GstVideo)"

inherit rpm

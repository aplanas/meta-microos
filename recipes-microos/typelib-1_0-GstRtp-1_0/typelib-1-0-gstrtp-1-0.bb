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

RPM_NAME = "typelib-1_0-GstRtp-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "3f786f2efc65278b4ad3f266bfd66da53ec51551851ac8856df8e38ca36b0bcdedca0d5a3c38811ce355aca6aeb205f04c481bbbe77c80b52b89ba3033c501b4"

RPROVIDES:${PN} += "typelib(GstRtp) typelib-1_0-GstRtp-1_0 typelib-1_0-GstRtp-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstrtp-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase)"

inherit rpm

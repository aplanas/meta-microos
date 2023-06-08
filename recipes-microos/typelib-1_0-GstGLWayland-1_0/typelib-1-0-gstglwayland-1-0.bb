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

RPM_NAME = "typelib-1_0-GstGLWayland-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "16216ebe182281293fe6ef49df19e3d731ac9abe8055bc45eef6bdba4b93ef48e5e4ba65abb076fab87bac62d03ca0802f77ca18893a70d645579956e2c5c624"

RPROVIDES:${PN} += "typelib(GstGLWayland) typelib-1_0-GstGLWayland-1_0 typelib-1_0-GstGLWayland-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstgl-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstGL) typelib(GstVideo)"

inherit rpm

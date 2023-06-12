SUMMARY = "Introspection bindings for the GStreamer-based RTSP server library"
DESCRIPTION = "Introspection bindings for the GStreamer library for building an RTSP server."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstRtspServer-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "cbd1b33801f60aff1f811c8171320ef5f9414935681a2d67f3eddfa954250917462cc679b9f58b8fc06c52631280b7bc19f537d3ed2732a1cb3496f0343f6b42"

RPROVIDES:${PN} += "typelib(GstRtspServer) \
typelib-1_0-GstRtspServer-1_0 \
typelib-1_0-GstRtspServer-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstrtspserver-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gio) \
typelib(Gst) \
typelib(GstBase) \
typelib(GstNet) \
typelib(GstRtsp) \
typelib(GstSdp)"

inherit rpm

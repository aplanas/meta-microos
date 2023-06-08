SUMMARY = "Introspection bindings for the GStreamer-based RTSP server library"
DESCRIPTION = "Introspection bindings for the GStreamer library for building an RTSP server."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstRtspServer-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "9323029d5c3395e4442156eb3a88e18b80b0cf2f7c3415e73e630968d93efded99687885192b7eba9fd3848c46d49dcde9fa41a33ed48268f24003acbdf84de6"

RPROVIDES:${PN} += "typelib(GstRtspServer) typelib-1_0-GstRtspServer-1_0 typelib-1_0-GstRtspServer-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstrtspserver-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio) typelib(Gst) typelib(GstBase) typelib(GstNet) typelib(GstRtsp) typelib(GstSdp)"

inherit rpm

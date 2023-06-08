SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstVulkanWayland-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "4dcc9cfc96c4b4607b179bc3a39e8d2bbc987761fda132cdb34cd4876516bb136712ab69cb5a338bff1761ddae77145a4ea500054d8a998c99dcd79a40fd6690"

RPROVIDES:${PN} += "typelib(GstVulkanWayland) typelib-1_0-GstVulkanWayland-1_0 typelib-1_0-GstVulkanWayland-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstvulkan-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstVideo) typelib(GstVulkan) typelib(Vulkan)"

inherit rpm

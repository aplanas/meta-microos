SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstVulkanXCB-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "6696881360ef32564694df1dbfc748a39a82a5948883398a3014af726d94b0ad92a034eeb7e42a84b2757b77302a8bc6b36ac386bc6606c811c28d127de24171"

RPROVIDES:${PN} += "typelib(GstVulkanXCB) typelib-1_0-GstVulkanXCB-1_0 typelib-1_0-GstVulkanXCB-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstvulkan-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstVideo) typelib(GstVulkan) typelib(Vulkan)"

inherit rpm

SUMMARY = "A collection of helpers for building DLNA applications - Development Files"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libgupnp-dlna-devel-0.12.0-1.10.aarch64.rpm"
RPM_HASH = "3b41d3c3143659c4570aa73a36ea1f762f75b5b34017a7724c1e5036c3d45f419a6b2650c16520c6061abbf0526281c531ccb538065ef8205d32990929fbf55c"

RPROVIDES:${PN} += "libgupnp-dlna-devel libgupnp-dlna-devel(aarch-64) pkgconfig(gupnp-dlna-2.0) pkgconfig(gupnp-dlna-gst-2.0) pkgconfig(gupnp-dlna-metadata-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgupnp-dlna-2_0-4 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gobject-2.0) pkgconfig(gstreamer-1.0) pkgconfig(gstreamer-pbutils-1.0) pkgconfig(gupnp-dlna-2.0) pkgconfig(libxml-2.0) typelib-1_0-GUPnPDLNA-2_0 typelib-1_0-GUPnPDLNAGst-2_0"

inherit rpm

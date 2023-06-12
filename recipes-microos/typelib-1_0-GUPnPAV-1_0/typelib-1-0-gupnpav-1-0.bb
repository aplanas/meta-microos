SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles -- Introspection bindings"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles. \
 \
This package provides the GObject Introspection bindings for GUPnP A/V."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "typelib-1_0-GUPnPAV-1_0-0.14.1-3.1.aarch64.rpm"
RPM_HASH = "31cc926c4cc4dfac0d01304518b0a53fc42687906b2c95edacaf4bd85a6994fd7906aea84c879769f5679b56afcc542216c05f6828d4e0ae328e5ed8e39d9237"

RPROVIDES:${PN} += "typelib(GUPnPAV) \
typelib-1_0-GUPnPAV-1_0 \
typelib-1_0-GUPnPAV-1_0(aarch-64)"
RDEPENDS:${PN} += "libgupnp-av-1.0.so.3()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(libxml2)"

inherit rpm

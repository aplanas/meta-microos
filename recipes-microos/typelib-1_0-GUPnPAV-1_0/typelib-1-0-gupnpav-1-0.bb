SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles -- Introspection bindings"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles. \
 \
This package provides the GObject Introspection bindings for GUPnP A/V."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "typelib-1_0-GUPnPAV-1_0-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "689085b2a48297b55769590070c1e6f3472797d487443f2207cf6aa67335558d3220f2b23dd0caf8e8e74e061b7add89e2abc1fcd27e7ee2bbecf4aca15c0f6d"

RPROVIDES:${PN} += "typelib(GUPnPAV) typelib-1_0-GUPnPAV-1_0 typelib-1_0-GUPnPAV-1_0(aarch-64)"
RDEPENDS:${PN} += "libgupnp-av-1.0.so.3()(64bit) typelib(GLib) typelib(GObject) typelib(libxml2)"

inherit rpm

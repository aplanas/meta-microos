SUMMARY = "Session / policy manager implementation for PipeWire"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire. \
 \
This package provides all the necessary files for development with WirePlumber"
LICENSE = "MIT"

PV = "0.4.14"

RPM_NAME = "wireplumber-devel-0.4.14-1.1.aarch64.rpm"
RPM_HASH = "a19a29bebaa9e595446b5fed1008c18f9ccd9692a08f216388a1cf945c74469423665b7e890627e1e98432f8b1638112d8b50a730af26ddfa3ad51e5eb6a9d40"

RPROVIDES:${PN} += "pkgconfig(wireplumber-0.4) wireplumber-devel wireplumber-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libwireplumber-0_4-0 pkgconfig(gio-2.0) pkgconfig(gmodule-2.0) pkgconfig(gobject-2.0) pkgconfig(libpipewire-0.3) wireplumber"

inherit rpm

SUMMARY = "Introspection bindings for the BAMF window matching library"
DESCRIPTION = "This package contains introspection data for the Bamf library. \
 \
This package provides the GObject Introspection bindings for Bamf."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "typelib-1_0-Bamf-3_0-0.5.6-1.4.aarch64.rpm"
RPM_HASH = "11c1a6698871172856a190b192555c6a09c73c4f4899973991762cc1d4a5f97a550c86ea5eda656cb69b7a558cd2a1aa3a3041d310024f8612d0ef2342a893a3"

RPROVIDES:${PN} += "typelib(Bamf) \
typelib-1_0-Bamf-3_0 \
typelib-1_0-Bamf-3_0(aarch-64)"
RDEPENDS:${PN} += "libbamf3.so.2()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm

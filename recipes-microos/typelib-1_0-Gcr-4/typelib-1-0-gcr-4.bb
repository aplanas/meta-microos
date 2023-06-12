SUMMARY = "Introspection bindings for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores. \
 \
This package provides the GObject Introspection bindings for GCR."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "typelib-1_0-Gcr-4-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "d45370041cc3993babefede224669b185b33cabb3bef081d67b1f1ec27248cce058fb5bf9f4db544daf0763ae7d513a00efcf9448bf11128a9a929504b89df11"

RPROVIDES:${PN} += "typelib(Gcr) \
typelib-1_0-Gcr-4 \
typelib-1_0-Gcr-4(aarch-64)"
RDEPENDS:${PN} += "libgcr-4.so.4()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gck) \
typelib(Gio) \
typelib-1_0-Gck-2"

inherit rpm

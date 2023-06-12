SUMMARY = "Introspection bindings for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores. \
 \
This package provides the GObject Introspection bindings for GCR."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "typelib-1_0-Gcr-3-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "6814ca3fa3d1e05222b8937f4a4ca8d547abdb9b8b545061e8694ae1a12f8e2c491d5b2f054fbc0e50c9ddb073ffc4776e5ed796cca93473ab7354890383ba61"

RPROVIDES:${PN} += "typelib(Gcr) \
typelib-1_0-Gcr-3 \
typelib-1_0-Gcr-3(aarch-64)"
RDEPENDS:${PN} += "libgcr-base-3.so.1()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gck) \
typelib(Gio) \
typelib-1_0-Gck-1"

inherit rpm

SUMMARY = "Introspection bindings for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way. \
 \
This package provides the GObject Introspection bindings for GCK."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "typelib-1_0-Gck-2-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "2ce5d0d7ca599526017e60d3f0c2ebe1d5a7c3283fd4df43087e69ab3b0be457fa212a53a283c761ba4a8729b14d29ff2407ea36a074afd94ad05b32c4409a1e"

RPROVIDES:${PN} += "typelib(Gck) typelib-1_0-Gck-2 typelib-1_0-Gck-2(aarch-64)"
RDEPENDS:${PN} += "libgck-2.so.2()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm

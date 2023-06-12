SUMMARY = "File Manager for the GNOME Desktop -- Introspection bindings"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package provides the GObject Introspection bindings for the library \
used by nautilus extensions."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "typelib-1_0-Nautilus-4_0-44.2-1.1.aarch64.rpm"
RPM_HASH = "f80b3c5a8cb433251f12d53c02db0eb2a60d886441b9e6076a9629f33423b85a9bd8a88fca548c57d7f5688506e82e34905cf5b78a64b2aa8e4c7e43f0ae8810"

RPROVIDES:${PN} += "typelib(Nautilus) \
typelib-1_0-Nautilus-4_0 \
typelib-1_0-Nautilus-4_0(aarch-64)"
RDEPENDS:${PN} += "libnautilus-extension.so.4()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm

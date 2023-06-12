SUMMARY = "PolicyKit Authorization Framework -- Introspection bindings"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes. \
 \
This package provides the GObject Introspection bindings for PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "typelib-1_0-Polkit-1_0-121-4.2.aarch64.rpm"
RPM_HASH = "70ecac85c43479c4311a79d8e23a775187e7595ca1c278fb6a0291fb334b6e16ac83c2d584ebbc607ff46c07e472ee202e6706d55f5e5a957062a12ffba2d2d8"

RPROVIDES:${PN} += "typelib(Polkit) \
typelib(PolkitAgent) \
typelib-1_0-Polkit-1_0 \
typelib-1_0-Polkit-1_0(aarch-64)"
RDEPENDS:${PN} += "libpolkit-agent-1.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm

SUMMARY = "Introspection bindings for the ATK accessibility toolkit"
DESCRIPTION = "The ATK library provides a set of accessibility interfaces. By \
supporting the ATK interfaces, an application or toolkit can be used \
with screen readers, magnifiers, and alternate input devices. \
 \
This package provides the GObject Introspection bindings for ATK."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "typelib-1_0-Atk-1_0-2.48.3-1.1.aarch64.rpm"
RPM_HASH = "59d41bb5952a979ee2adfdedfe220846a2a8f30f180c465598af8f2fd4e1217cf785339d91a8c5734609c4047ab1332baa7db494b68d1b1cb5aa2a598d983b7c"

RPROVIDES:${PN} += "typelib(Atk) typelib-1_0-Atk-1_0 typelib-1_0-Atk-1_0(aarch-64)"
RDEPENDS:${PN} += "libatk-1.0.so.0()(64bit) typelib(GLib) typelib(GObject)"

inherit rpm

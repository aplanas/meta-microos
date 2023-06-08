SUMMARY = "Introspection bindings for the ATK accessibility toolkit"
DESCRIPTION = "The ATK library provides a set of accessibility interfaces. By \
supporting the ATK interfaces, an application or toolkit can be used \
with screen readers, magnifiers, and alternate input devices. \
 \
This package provides the GObject Introspection bindings for ATK."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.0"

RPM_NAME = "typelib-1_0-Atk-1_0-2.48.0-1.1.aarch64.rpm"
RPM_HASH = "cf60d5b545aa5e9584fdc629fedc48fe0b5481aeadc61fc3af86f133544fd7862003ea1cefeca5c84665f8307a8f13b5e2241585a15567070b6bf72d71ec7050"

RPROVIDES:${PN} += "typelib(Atk) typelib-1_0-Atk-1_0 typelib-1_0-Atk-1_0(aarch-64)"
RDEPENDS:${PN} += "libatk-1.0.so.0()(64bit) typelib(GLib) typelib(GObject)"

inherit rpm

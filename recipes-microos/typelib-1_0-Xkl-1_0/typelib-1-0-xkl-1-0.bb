SUMMARY = "Introspection bindings for libxklavier"
DESCRIPTION = "This library allows you to simplify XKB-related development. \
 \
This package provides the GObject Introspection bindings for \
libxklavier."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "typelib-1_0-Xkl-1_0-5.4-1.7.aarch64.rpm"
RPM_HASH = "596ec8257f4af4b50ec40b7b5c58a37a6b8676b0322848a97817262f8e61626709010d5b6d9ee2a52bf09ab0a1ef5d8c69bbb9730a67251f4e48003389ca6321"

RPROVIDES:${PN} += "typelib(Xkl) typelib-1_0-Xkl-1_0 typelib-1_0-Xkl-1_0(aarch-64)"
RDEPENDS:${PN} += "libxklavier.so.16()(64bit) typelib(GLib) typelib(GObject) typelib(xlib)"

inherit rpm

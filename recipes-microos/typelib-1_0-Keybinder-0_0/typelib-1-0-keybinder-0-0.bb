SUMMARY = "Introspection bindins for the Keybinder library"
DESCRIPTION = "Library for registering global keyboard shortcuts. Keybinder \
works with GTK-based applications using the X Window System. \
 \
This package provides the GObject Introspection bindings for libkeybinder0."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.3.1"

RPM_NAME = "typelib-1_0-Keybinder-0_0-0.3.1-3.6.aarch64.rpm"
RPM_HASH = "e58b400e69d85b11d6b65b1062767cc1c7c03638ce89e8d34bb3b621a39fac85182b957c7dbbfc4a063ac746153793bbc41777dca0e59f14fd411eafd79dcac6"

RPROVIDES:${PN} += "typelib(Keybinder) \
typelib-1_0-Keybinder-0_0 \
typelib-1_0-Keybinder-0_0(aarch-64)"
RDEPENDS:${PN} += "libkeybinder.so.0()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm

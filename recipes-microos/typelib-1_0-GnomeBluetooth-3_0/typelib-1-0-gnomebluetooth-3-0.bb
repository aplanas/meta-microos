SUMMARY = "Introspection bindings for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GObject Introspection bindings for the GNOME Bluetooth's \
libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "typelib-1_0-GnomeBluetooth-3_0-42.5-1.3.aarch64.rpm"
RPM_HASH = "80ca710819731bbe5120a8627dd42b06687023890b547228c83520a16d6a152b6293cfde4fe5ce47080b17743c9a869183a44ba6be34245177bdb4b1c1e68a64"

RPROVIDES:${PN} += "typelib(GnomeBluetooth) typelib-1_0-GnomeBluetooth-3_0 typelib-1_0-GnomeBluetooth-3_0(aarch-64)"
RDEPENDS:${PN} += "libgnome-bluetooth-3.0.so.13()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm

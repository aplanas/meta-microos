SUMMARY = "LibCVC API -- Introspection bindings"
DESCRIPTION = "Utility library for volume control of pulseaudio from gobject-based \
Cinnamon modules/applications. \
 \
This package provides the GObject Introspection bindings for libcvc."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.6.2"

RPM_NAME = "typelib-1_0-Cvc-1_0-5.6.2-1.1.aarch64.rpm"
RPM_HASH = "496b672a45b1e4dd96ccd609a9c1d181342cb027a36b5ed54778a444d141a01e4b4d29957c19e933512f60e11a3625ae832c0711560ec184049aa738fc259ef2"

RPROVIDES:${PN} += "typelib(Cvc) typelib-1_0-Cvc-1_0 typelib-1_0-Cvc-1_0(aarch-64)"
RDEPENDS:${PN} += "libcvc.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm

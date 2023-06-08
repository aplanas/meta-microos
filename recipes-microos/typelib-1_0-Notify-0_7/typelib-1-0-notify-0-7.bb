SUMMARY = "Notifications Library -- Introspection bindings"
DESCRIPTION = "D-BUS notifications library. \
 \
This package provides the GObject Introspection bindings for libnotify."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "typelib-1_0-Notify-0_7-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "36ecc6f770dfca7ce55a679ffbdf8a0d44ded7bbb81f0ff024cee38a69b98999eb14700d5dea10ffe888dce37388e6fd74ba1f11bdff82f77af2c94950836a39"

RPROVIDES:${PN} += "typelib(Notify) typelib-1_0-Notify-0_7 typelib-1_0-Notify-0_7(aarch-64)"
RDEPENDS:${PN} += "libnotify.so.4()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(GdkPixbuf) typelib(Gio)"

inherit rpm

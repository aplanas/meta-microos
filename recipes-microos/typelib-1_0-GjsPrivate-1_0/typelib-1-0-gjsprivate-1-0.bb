SUMMARY = "Introspection bindings for the GJS library"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.76.0"

RPM_NAME = "typelib-1_0-GjsPrivate-1_0-1.76.0-1.1.aarch64.rpm"
RPM_HASH = "6870173aacd2f27b281f59105cd36ffbba216a308f130cebc72eddda13a8082a526828c0aed4f16b9d7769c928b3fe44e50d1aab6163abe57cc5e5b36500d7ee"

RPROVIDES:${PN} += "typelib(GjsPrivate) typelib-1_0-GjsPrivate-1_0 typelib-1_0-GjsPrivate-1_0(aarch-64)"
RDEPENDS:${PN} += "libgjs.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm

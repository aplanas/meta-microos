SUMMARY = "Introspection bindings for the Telepathy Call channel handling library"
DESCRIPTION = "Telepathy Farstream is a Telepathy client library that uses Farsight2 \
to handle Call channels."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "typelib-1_0-TelepathyFarstream-0_6-0.6.2-2.23.aarch64.rpm"
RPM_HASH = "87e6194a46dd573ba4be6f6f61ab438baddb005ca9395c0d05588ebfde0a8b687209bd07c5237a7e54722f2a882df8780bd0f9b226b1df520690a1da07e4fdf7"

RPROVIDES:${PN} += "typelib(TelepathyFarstream) typelib-1_0-TelepathyFarstream-0_6 typelib-1_0-TelepathyFarstream-0_6(aarch-64)"
RDEPENDS:${PN} += "libtelepathy-farstream.so.3()(64bit) typelib(Farstream) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio) typelib(Gst) typelib(TelepathyGLib)"

inherit rpm

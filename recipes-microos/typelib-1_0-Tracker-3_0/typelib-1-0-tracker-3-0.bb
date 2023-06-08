SUMMARY = "Introspection bindings for the Tracker Sparql library"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This package provides the GObject Introspection bindings for the \
sparql library for Tracker."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "typelib-1_0-Tracker-3_0-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "4f3028ffb178c26f2c05cb9dbaaa35decb75213245aba78a3fb35fd6c021ff2b2637798124e89faa5b57858ff6c8dffaa5653c9cbec525c953cf414003b4fba0"

RPROVIDES:${PN} += "typelib(Tracker) typelib-1_0-Tracker-3_0 typelib-1_0-Tracker-3_0(aarch-64)"
RDEPENDS:${PN} += "libtracker-sparql-3.0.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm

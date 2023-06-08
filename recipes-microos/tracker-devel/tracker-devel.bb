SUMMARY = "Development files for the Tracker indexer"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This subpackage contains the headers to make use of its libraries."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "tracker-devel-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "53a95a6affed434e9afe25d9c7fc2df50a9f252363439cf8383d77366aeabb78aa19894f76765a4796a24959d3391af574f4080cdaa5bf4a398d87549e230f57"

RPROVIDES:${PN} += "pkgconfig(tracker-sparql-3.0) pkgconfig(tracker-testutils-3.0) tracker-devel tracker-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libtracker-sparql-3_0-0 pkgconfig(gio-2.0) pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gobject-2.0) pkgconfig(json-glib-1.0) pkgconfig(libxml-2.0) pkgconfig(sqlite3) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Tracker) typelib-1_0-Tracker-3_0"

inherit rpm

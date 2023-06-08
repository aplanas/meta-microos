SUMMARY = "C++ wrapper around SQLite 3.x - Development Files"
DESCRIPTION = "wxSQLite3 is a C++ wrapper around the public domain SQLite 3.x database \
and is specifically designed for use in programs based on the wxWidgets \
library."
LICENSE = "SUSE-wxWidgets-3.1"

PV = "4.9.1"

RPM_NAME = "wxsqlite3-devel-4.9.1-1.4.aarch64.rpm"
RPM_HASH = "efdb006235a9ffaf40ff16e920950b43c82513ec0df804bad48b0f58ef6bdab65c147457f711263f8a07415f1a5d333bdca271efebcc51c0aa5ac22a2d7096f1"

RPROVIDES:${PN} += "pkgconfig(wxsqlite3) wxsqlite3-devel wxsqlite3-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libwxcode_gtk2u_wxsqlite3-3_2-0"

inherit rpm

SUMMARY = "The Table engine for IBus platform"
DESCRIPTION = "The package contains general Table engine for IBus platform."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17.0"

RPM_NAME = "ibus-table-1.17.0-1.1.aarch64.rpm"
RPM_HASH = "a7f5280abd7a8ae6925a0f569bc9a253fef814f17af2c3fb4fc339115949e5bd694b1e0984be27e9c3685a97497d1cafc18c8b66f91c18df3df27fa14cf948e5"

RPROVIDES:${PN} += "application() application(ibus-setup-table.desktop) ibus-table ibus-table(aarch-64) metainfo() metainfo(ibus-table.appdata.xml)"
RDEPENDS:${PN} += "/bin/sh ibus python3 python3-curses"

inherit rpm

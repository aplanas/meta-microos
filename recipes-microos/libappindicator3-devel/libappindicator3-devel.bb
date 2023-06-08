SUMMARY = "Development files for libappindicator"
DESCRIPTION = "This package contains the development files for the appindicator3 library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "libappindicator3-devel-12.10.1~bzr20200706.298-2.3.aarch64.rpm"
RPM_HASH = "0cfda799312137338a47aefe9c24e5c7025c102354af5875b40df7879fe1c65eee7f233cd076d3bda4e21a6e745a950b4cacae3be06f9b71fa05ea373493a36b"

RPROVIDES:${PN} += "libappindicator3-devel libappindicator3-devel(aarch-64) pkgconfig(appindicator3-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libappindicator3-1 pkgconfig(dbusmenu-glib-0.4) pkgconfig(gtk+-3.0)"

inherit rpm

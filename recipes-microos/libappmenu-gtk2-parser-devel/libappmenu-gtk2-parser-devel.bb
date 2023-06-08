SUMMARY = "Development files for libappmenu-gtk2-parser"
DESCRIPTION = "This package contains development-files for libappmenu-gtk2-parser."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "libappmenu-gtk2-parser-devel-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "dd8ca81782dada34b998c1e0cbe032b7bb86c7b6cf338125cffa507aec36fed5e651506791d382b18ab735811d9206ec690a82d0429688c3f56d7b1ab8fe5555"

RPROVIDES:${PN} += "libappmenu-gtk2-parser-devel libappmenu-gtk2-parser-devel(aarch-64) pkgconfig(appmenu-gtk2-parser)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libappmenu-gtk-parser-devel libappmenu-gtk2-parser0 pkgconfig(gtk+-2.0)"

inherit rpm

SUMMARY = "Development files for GtkDatabox"
DESCRIPTION = "The libgtkdatabox-devel package contains libraries, header files and \
documentation for developing applications that use libgtkdatabox."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "gtkdatabox-devel-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "eb01822b3aab3369abc0ea3e10d3b001b046eb044c94c31bd2ab8fec66302f8de0784394310adfb3e0dcfccf474174abd42e4c9e7349f86767be37e922189b79"

RPROVIDES:${PN} += "gtkdatabox-devel gtkdatabox-devel(aarch-64) pkgconfig(gtkdatabox)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgtkdatabox1 pkgconfig(cairo) pkgconfig(gtk+-3.0) pkgconfig(pango)"

inherit rpm

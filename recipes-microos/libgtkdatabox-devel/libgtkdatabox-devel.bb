SUMMARY = "Development files for GtkDatabox"
DESCRIPTION = "The libgtkdatabox-devel package contains libraries, header files and \
documentation for developing applications that use libgtkdatabox."
LICENSE = "LGPL-2.1+"

PV = "0.9.3.1"

RPM_NAME = "libgtkdatabox-devel-0.9.3.1-1.9.aarch64.rpm"
RPM_HASH = "285ab9ad7ca4fa55d4f5cf89fcee16480e5a26e7dde235e3df24f724c9f6dfe7e6bbb70a60fdb975714b6ad1b4c7dbe25bc2466b513b3f479a1a8c7c5268cf11"

RPROVIDES:${PN} += "libgtkdatabox-devel libgtkdatabox-devel(aarch-64) pkgconfig(gtkdatabox)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgtkdatabox pkgconfig(cairo) pkgconfig(gtk+-2.0) pkgconfig(pango)"

inherit rpm

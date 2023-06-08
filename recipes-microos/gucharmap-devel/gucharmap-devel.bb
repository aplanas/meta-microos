SUMMARY = "A Featureful Unicode Character Map -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "15.0.4"

RPM_NAME = "gucharmap-devel-15.0.4-1.1.aarch64.rpm"
RPM_HASH = "12013b52c3df1a3e830fc36f92ce505b93e669f74edbb9530756c474369fb1e7adf4ea29eb6b91315962d9d29f1cac20ea0deadec0f0f517271f1c35f5c9d2f9"

RPROVIDES:${PN} += "gucharmap-devel gucharmap-devel(aarch-64) pkgconfig(gucharmap-2.90)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgucharmap_2_90-7 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gtk+-3.0) pkgconfig(libpcre2-8) typelib-1_0-Gucharmap-2_90"

inherit rpm

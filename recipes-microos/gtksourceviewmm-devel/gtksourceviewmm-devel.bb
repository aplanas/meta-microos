SUMMARY = "Development files for the gtksourceview C++ interface"
DESCRIPTION = "gtksourceviewmm provides a C++ interface to the gtksourceview library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.91.1"

RPM_NAME = "gtksourceviewmm-devel-3.91.1-1.16.aarch64.rpm"
RPM_HASH = "06921adf682f934d4a762bf210142c551953091fb667b5cf2460d6a516d9367fc49037abe51378cf40ced270abf063009fcb0e1fea1c16eb778734ff17b300bb"

RPROVIDES:${PN} += "gtksourceviewmm-devel gtksourceviewmm-devel(aarch-64) pkgconfig(gtksourceviewmm-4.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgtksourceviewmm-4_0-0 pkgconfig(glibmm-2.4) pkgconfig(gtkmm-3.0) pkgconfig(gtksourceview-4)"

inherit rpm

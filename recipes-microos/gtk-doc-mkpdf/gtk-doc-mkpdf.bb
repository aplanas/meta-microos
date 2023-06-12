SUMMARY = "Gtkdoc PDF Generator"
DESCRIPTION = "PDF generator for Gtkdoc."
LICENSE = "GPL-2.0-or-later"

PV = "1.33.2"

RPM_NAME = "gtk-doc-mkpdf-1.33.2-1.5.aarch64.rpm"
RPM_HASH = "94f77ca9865c52fb7be1e604aa95be83891bac60ca29c9020ea487076ab59a32664413ee4ceab2c90c34407c98dd0c1388934f798eb22924bd45fd6c05e1c700"

RPROVIDES:${PN} += "gtk-doc-mkpdf \
gtk-doc-mkpdf(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
dblatex \
gtk-doc"

inherit rpm

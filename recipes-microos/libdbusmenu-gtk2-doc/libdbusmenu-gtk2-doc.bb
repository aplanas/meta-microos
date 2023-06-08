SUMMARY = "Documentation for libdbusmenu - GTK 2 and GTK 3"
DESCRIPTION = "This package contains the documentation for the dbusmenu-gtk2 and dbusmenu-gtk3 \
libraries."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk2-doc-16.04.0-9.3.noarch.rpm"
RPM_HASH = "2791c9487d25148cff3d51824102f93c41aa86c69fa020a39e144d1cea210512d1e3cba7335f5111bc350da05071d7f1ab4625984315513a79618e2be0656533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbusmenu-gtk2-doc"
RDEPENDS:${PN} += ""

inherit rpm

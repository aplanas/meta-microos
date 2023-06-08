SUMMARY = "Krusader documentation"
DESCRIPTION = "Krusader is an advanced twin panel (commander style) file manager for KDE Plasma \
and other desktops in the *nix world. \
 \
This package contains the krusader documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "krusader-doc-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "179c61f1998230427a0f79efd346042a082e2f4534c1519906f9014697f0be4633bf838c036e308202287afbbecefc21354bafc2f506aba70a3a5c7fd4ef88fc"

RPROVIDES:${PN} += "krusader-doc krusader-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

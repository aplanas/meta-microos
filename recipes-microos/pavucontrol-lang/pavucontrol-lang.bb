SUMMARY = "Translations for package pavucontrol"
DESCRIPTION = "Provides translations for the 'pavucontrol' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "pavucontrol-lang-5.0-1.9.noarch.rpm"
RPM_HASH = "566ee2fa22c4c55ea2f0d59f335e1c8338622d2d19e77c4c5a4b2586df60dc8c3ef46fa02a58b471a234a55adc5e1b2780f478163791c5c407e136a5113c9d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pavucontrol:as) locale(pavucontrol:ast) locale(pavucontrol:be) locale(pavucontrol:bn_IN) locale(pavucontrol:ca) locale(pavucontrol:ca@valencia) locale(pavucontrol:cs) locale(pavucontrol:da) locale(pavucontrol:de) locale(pavucontrol:el) locale(pavucontrol:es) locale(pavucontrol:eu) locale(pavucontrol:fi) locale(pavucontrol:fr) locale(pavucontrol:gl) locale(pavucontrol:gu) locale(pavucontrol:he) locale(pavucontrol:hi) locale(pavucontrol:hr) locale(pavucontrol:hu) locale(pavucontrol:it) locale(pavucontrol:ja) locale(pavucontrol:kk) locale(pavucontrol:kn) locale(pavucontrol:ko) locale(pavucontrol:lt) locale(pavucontrol:ml) locale(pavucontrol:mr) locale(pavucontrol:nb_NO) locale(pavucontrol:nl) locale(pavucontrol:nn) locale(pavucontrol:or) locale(pavucontrol:pa) locale(pavucontrol:pl) locale(pavucontrol:pt) locale(pavucontrol:pt_BR) locale(pavucontrol:ru) locale(pavucontrol:si) locale(pavucontrol:sk) locale(pavucontrol:sl) locale(pavucontrol:sr) locale(pavucontrol:sr@latin) locale(pavucontrol:sv) locale(pavucontrol:ta) locale(pavucontrol:te) locale(pavucontrol:th) locale(pavucontrol:tr) locale(pavucontrol:uk) locale(pavucontrol:zh_CN) locale(pavucontrol:zh_TW) pavucontrol-lang pavucontrol-lang-all"
RDEPENDS:${PN} += "pavucontrol"

inherit rpm

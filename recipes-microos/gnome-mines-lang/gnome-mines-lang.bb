SUMMARY = "Translations for package gnome-mines"
DESCRIPTION = "Provides translations for the 'gnome-mines' package."
LICENSE = "GPL-3.0-or-later"

PV = "40.1"

RPM_NAME = "gnome-mines-lang-40.1-1.7.noarch.rpm"
RPM_HASH = "0933793bfbc72f292dc19ff4168cb6fd66f2f1d636dce76331921d624b122aa0844d0eb66043c8f3311da205dfc1ac1e6142b8cb8f6acf15fde5cc59c1713f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-mines-lang gnome-mines-lang-all locale(gnome-mines:af) locale(gnome-mines:ar) locale(gnome-mines:as) locale(gnome-mines:ast) locale(gnome-mines:az) locale(gnome-mines:be) locale(gnome-mines:bg) locale(gnome-mines:bn) locale(gnome-mines:bn_IN) locale(gnome-mines:br) locale(gnome-mines:bs) locale(gnome-mines:ca) locale(gnome-mines:ca@valencia) locale(gnome-mines:cs) locale(gnome-mines:cy) locale(gnome-mines:da) locale(gnome-mines:de) locale(gnome-mines:dz) locale(gnome-mines:el) locale(gnome-mines:en@shaw) locale(gnome-mines:en_CA) locale(gnome-mines:en_GB) locale(gnome-mines:eo) locale(gnome-mines:es) locale(gnome-mines:et) locale(gnome-mines:eu) locale(gnome-mines:fa) locale(gnome-mines:fi) locale(gnome-mines:fr) locale(gnome-mines:fur) locale(gnome-mines:ga) locale(gnome-mines:gl) locale(gnome-mines:gu) locale(gnome-mines:he) locale(gnome-mines:hi) locale(gnome-mines:hr) locale(gnome-mines:hu) locale(gnome-mines:id) locale(gnome-mines:is) locale(gnome-mines:it) locale(gnome-mines:ja) locale(gnome-mines:ka) locale(gnome-mines:kk) locale(gnome-mines:km) locale(gnome-mines:kn) locale(gnome-mines:ko) locale(gnome-mines:lt) locale(gnome-mines:lv) locale(gnome-mines:mai) locale(gnome-mines:mk) locale(gnome-mines:ml) locale(gnome-mines:mr) locale(gnome-mines:ms) locale(gnome-mines:nb) locale(gnome-mines:ne) locale(gnome-mines:nl) locale(gnome-mines:nn) locale(gnome-mines:oc) locale(gnome-mines:or) locale(gnome-mines:pa) locale(gnome-mines:pl) locale(gnome-mines:pt) locale(gnome-mines:pt_BR) locale(gnome-mines:ro) locale(gnome-mines:ru) locale(gnome-mines:si) locale(gnome-mines:sk) locale(gnome-mines:sl) locale(gnome-mines:sq) locale(gnome-mines:sr) locale(gnome-mines:sr@latin) locale(gnome-mines:sv) locale(gnome-mines:ta) locale(gnome-mines:te) locale(gnome-mines:th) locale(gnome-mines:tr) locale(gnome-mines:ug) locale(gnome-mines:uk) locale(gnome-mines:vi) locale(gnome-mines:wa) locale(gnome-mines:zh_CN) locale(gnome-mines:zh_HK) locale(gnome-mines:zh_TW)"
RDEPENDS:${PN} += "gnome-mines"

inherit rpm

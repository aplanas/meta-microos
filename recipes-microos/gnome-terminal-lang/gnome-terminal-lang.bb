SUMMARY = "Translations for package gnome-terminal"
DESCRIPTION = "Provides translations for the 'gnome-terminal' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.1"

RPM_NAME = "gnome-terminal-lang-3.48.1-1.1.noarch.rpm"
RPM_HASH = "461b8ae061291e3e848f4764352b7630b2077f26b42b2dc6ba5d4bfc93fce0c4c54c81b964bf7d21ac9c0023f68527a2d5888eb203544b44de2b79b726814f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-terminal-lang gnome-terminal-lang-all locale(gnome-terminal:ar) locale(gnome-terminal:as) locale(gnome-terminal:ast) locale(gnome-terminal:az) locale(gnome-terminal:be) locale(gnome-terminal:be@latin) locale(gnome-terminal:bg) locale(gnome-terminal:bn) locale(gnome-terminal:bn_IN) locale(gnome-terminal:br) locale(gnome-terminal:bs) locale(gnome-terminal:ca) locale(gnome-terminal:ca@valencia) locale(gnome-terminal:cs) locale(gnome-terminal:cy) locale(gnome-terminal:da) locale(gnome-terminal:de) locale(gnome-terminal:dz) locale(gnome-terminal:el) locale(gnome-terminal:en@shaw) locale(gnome-terminal:en_CA) locale(gnome-terminal:en_GB) locale(gnome-terminal:eo) locale(gnome-terminal:es) locale(gnome-terminal:et) locale(gnome-terminal:eu) locale(gnome-terminal:fa) locale(gnome-terminal:fi) locale(gnome-terminal:fr) locale(gnome-terminal:fur) locale(gnome-terminal:ga) locale(gnome-terminal:gd) locale(gnome-terminal:gl) locale(gnome-terminal:gu) locale(gnome-terminal:he) locale(gnome-terminal:hi) locale(gnome-terminal:hr) locale(gnome-terminal:hu) locale(gnome-terminal:id) locale(gnome-terminal:is) locale(gnome-terminal:it) locale(gnome-terminal:ja) locale(gnome-terminal:ka) locale(gnome-terminal:kk) locale(gnome-terminal:km) locale(gnome-terminal:kn) locale(gnome-terminal:ko) locale(gnome-terminal:lt) locale(gnome-terminal:lv) locale(gnome-terminal:mai) locale(gnome-terminal:mk) locale(gnome-terminal:ml) locale(gnome-terminal:mr) locale(gnome-terminal:ms) locale(gnome-terminal:nb) locale(gnome-terminal:nds) locale(gnome-terminal:ne) locale(gnome-terminal:nl) locale(gnome-terminal:nn) locale(gnome-terminal:oc) locale(gnome-terminal:or) locale(gnome-terminal:pa) locale(gnome-terminal:pl) locale(gnome-terminal:pt) locale(gnome-terminal:pt_BR) locale(gnome-terminal:ro) locale(gnome-terminal:ru) locale(gnome-terminal:si) locale(gnome-terminal:sk) locale(gnome-terminal:sl) locale(gnome-terminal:sq) locale(gnome-terminal:sr) locale(gnome-terminal:sr@latin) locale(gnome-terminal:sv) locale(gnome-terminal:ta) locale(gnome-terminal:te) locale(gnome-terminal:th) locale(gnome-terminal:tr) locale(gnome-terminal:ug) locale(gnome-terminal:uk) locale(gnome-terminal:vi) locale(gnome-terminal:wa) locale(gnome-terminal:zh_CN) locale(gnome-terminal:zh_HK) locale(gnome-terminal:zh_TW)"
RDEPENDS:${PN} += "gnome-terminal"

inherit rpm

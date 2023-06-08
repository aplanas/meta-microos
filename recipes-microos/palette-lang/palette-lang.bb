SUMMARY = "Translations for package palette"
DESCRIPTION = "Provides translations for the 'palette' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "palette-lang-4.0.0-1.10.noarch.rpm"
RPM_HASH = "35d811d336661b574c317f0316a7e1f6f43ae3f47bea4b1abcdc5293f72ae57f2909e6fc970e51777080f52d0d97152db5ab56b1b598b837e36d5452c99436eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(palette:af) locale(palette:ar) locale(palette:as) locale(palette:ast) locale(palette:az) locale(palette:be) locale(palette:bg) locale(palette:bn) locale(palette:br) locale(palette:bs) locale(palette:ca) locale(palette:cs) locale(palette:cy) locale(palette:da) locale(palette:de) locale(palette:dz) locale(palette:el) locale(palette:en_AU) locale(palette:en_CA) locale(palette:en_GB) locale(palette:eo) locale(palette:es) locale(palette:et) locale(palette:eu) locale(palette:fa) locale(palette:fi) locale(palette:fr) locale(palette:fr_CA) locale(palette:ga) locale(palette:gd) locale(palette:gl) locale(palette:gu) locale(palette:he) locale(palette:hi) locale(palette:hr) locale(palette:hu) locale(palette:ia) locale(palette:id) locale(palette:is) locale(palette:it) locale(palette:ja) locale(palette:ka) locale(palette:kk) locale(palette:km) locale(palette:kn) locale(palette:ko) locale(palette:lt) locale(palette:lv) locale(palette:mk) locale(palette:ml) locale(palette:mr) locale(palette:ms) locale(palette:nb) locale(palette:ne) locale(palette:nl) locale(palette:nn) locale(palette:oc) locale(palette:or) locale(palette:pa) locale(palette:pl) locale(palette:pt) locale(palette:pt_BR) locale(palette:ro) locale(palette:ru) locale(palette:si) locale(palette:sk) locale(palette:sl) locale(palette:sq) locale(palette:sr) locale(palette:sv) locale(palette:ta) locale(palette:te) locale(palette:th) locale(palette:tr) locale(palette:ug) locale(palette:uk) locale(palette:vi) locale(palette:wa) locale(palette:zh) locale(palette:zh_CN) locale(palette:zh_HK) locale(palette:zh_TW) palette-lang palette-lang-all"
RDEPENDS:${PN} += "palette"

inherit rpm

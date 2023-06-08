SUMMARY = "Translations for package totem"
DESCRIPTION = "Provides translations for the 'totem' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "totem-lang-43.0-2.3.noarch.rpm"
RPM_HASH = "25fe8f503349be539f9aeb3097ca51151178641206cf8cdab79fdd6a4604d13d2c57f15264206db36e4d99aa6af55b747e1ed5006345a5f4831533cc12a8e21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(totem:af) locale(totem:ar) locale(totem:as) locale(totem:ast) locale(totem:az) locale(totem:be) locale(totem:be@latin) locale(totem:bg) locale(totem:bn) locale(totem:bn_IN) locale(totem:bs) locale(totem:ca) locale(totem:ca@valencia) locale(totem:cs) locale(totem:cy) locale(totem:da) locale(totem:de) locale(totem:dz) locale(totem:el) locale(totem:en@shaw) locale(totem:en_CA) locale(totem:en_GB) locale(totem:eo) locale(totem:es) locale(totem:et) locale(totem:eu) locale(totem:fa) locale(totem:fi) locale(totem:fr) locale(totem:fur) locale(totem:ga) locale(totem:gd) locale(totem:gl) locale(totem:gu) locale(totem:he) locale(totem:hi) locale(totem:hr) locale(totem:hu) locale(totem:id) locale(totem:is) locale(totem:it) locale(totem:ja) locale(totem:ka) locale(totem:kk) locale(totem:km) locale(totem:kn) locale(totem:ko) locale(totem:lt) locale(totem:lv) locale(totem:mai) locale(totem:mk) locale(totem:ml) locale(totem:mr) locale(totem:ms) locale(totem:nb) locale(totem:ne) locale(totem:nl) locale(totem:nn) locale(totem:oc) locale(totem:or) locale(totem:pa) locale(totem:pl) locale(totem:pt) locale(totem:pt_BR) locale(totem:ro) locale(totem:ru) locale(totem:si) locale(totem:sk) locale(totem:sl) locale(totem:sq) locale(totem:sr) locale(totem:sr@latin) locale(totem:sv) locale(totem:ta) locale(totem:te) locale(totem:th) locale(totem:tr) locale(totem:ug) locale(totem:uk) locale(totem:vi) locale(totem:wa) locale(totem:zh_CN) locale(totem:zh_HK) locale(totem:zh_TW) totem-lang totem-lang-all"
RDEPENDS:${PN} += "totem"

inherit rpm

SUMMARY = "Translations for package mate-menus"
DESCRIPTION = "Provides translations for the 'mate-menus' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "mate-menus-lang-1.26.0-1.8.noarch.rpm"
RPM_HASH = "92ed59907d8b6e50ef800592d2cc68c08923272e32737c301440bdf4862b8e455498a5e27d62b253faff2d530fe1d92a010a42ac5928fd580bdc194df6f0314c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-menus:af) locale(mate-menus:ar) locale(mate-menus:as) locale(mate-menus:ast) locale(mate-menus:az) locale(mate-menus:be) locale(mate-menus:bg) locale(mate-menus:bn) locale(mate-menus:bn_IN) locale(mate-menus:br) locale(mate-menus:bs) locale(mate-menus:ca) locale(mate-menus:ca@valencia) locale(mate-menus:cs) locale(mate-menus:cy) locale(mate-menus:da) locale(mate-menus:de) locale(mate-menus:dz) locale(mate-menus:el) locale(mate-menus:en_AU) locale(mate-menus:en_CA) locale(mate-menus:en_GB) locale(mate-menus:eo) locale(mate-menus:es) locale(mate-menus:es_AR) locale(mate-menus:es_CL) locale(mate-menus:es_CO) locale(mate-menus:es_ES) locale(mate-menus:es_MX) locale(mate-menus:es_PR) locale(mate-menus:et) locale(mate-menus:eu) locale(mate-menus:fa) locale(mate-menus:fi) locale(mate-menus:fr) locale(mate-menus:fr_CA) locale(mate-menus:fur) locale(mate-menus:ga) locale(mate-menus:gl) locale(mate-menus:gu) locale(mate-menus:he) locale(mate-menus:hi) locale(mate-menus:hr) locale(mate-menus:hu) locale(mate-menus:ia) locale(mate-menus:id) locale(mate-menus:is) locale(mate-menus:it) locale(mate-menus:ja) locale(mate-menus:ka) locale(mate-menus:kk) locale(mate-menus:km) locale(mate-menus:kn) locale(mate-menus:ko) locale(mate-menus:lt) locale(mate-menus:lv) locale(mate-menus:mai) locale(mate-menus:mk) locale(mate-menus:ml) locale(mate-menus:mr) locale(mate-menus:ms) locale(mate-menus:nb) locale(mate-menus:nds) locale(mate-menus:ne) locale(mate-menus:nl) locale(mate-menus:nn) locale(mate-menus:oc) locale(mate-menus:or) locale(mate-menus:pa) locale(mate-menus:pl) locale(mate-menus:pt) locale(mate-menus:pt_BR) locale(mate-menus:ro) locale(mate-menus:ru) locale(mate-menus:si) locale(mate-menus:sk) locale(mate-menus:sl) locale(mate-menus:sq) locale(mate-menus:sr) locale(mate-menus:sr@latin) locale(mate-menus:sv) locale(mate-menus:ta) locale(mate-menus:te) locale(mate-menus:th) locale(mate-menus:tr) locale(mate-menus:ug) locale(mate-menus:uk) locale(mate-menus:vi) locale(mate-menus:wa) locale(mate-menus:zh_CN) locale(mate-menus:zh_HK) locale(mate-menus:zh_TW) mate-menus-lang mate-menus-lang-all"
RDEPENDS:${PN} += "mate-menus"

inherit rpm

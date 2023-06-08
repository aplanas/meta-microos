SUMMARY = "Translations for package vino"
DESCRIPTION = "Provides translations for the 'vino' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.22.0"

RPM_NAME = "vino-lang-3.22.0-9.8.noarch.rpm"
RPM_HASH = "eeea6fb18ce27ad6b21f8ed596913e87dc58081e7f8827a72c1c5a395b74d73e52cbec31afdb15e9081558391c521acb0551d734d7e5b6da112486bcd30d0f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(vino:ar) locale(vino:as) locale(vino:ast) locale(vino:az) locale(vino:be) locale(vino:be@latin) locale(vino:bg) locale(vino:bn) locale(vino:bn_IN) locale(vino:bs) locale(vino:ca) locale(vino:ca@valencia) locale(vino:cs) locale(vino:cy) locale(vino:da) locale(vino:de) locale(vino:dz) locale(vino:el) locale(vino:en@shaw) locale(vino:en_CA) locale(vino:en_GB) locale(vino:eo) locale(vino:es) locale(vino:et) locale(vino:eu) locale(vino:fa) locale(vino:fi) locale(vino:fr) locale(vino:fur) locale(vino:ga) locale(vino:gl) locale(vino:gu) locale(vino:he) locale(vino:hi) locale(vino:hr) locale(vino:hu) locale(vino:id) locale(vino:is) locale(vino:it) locale(vino:ja) locale(vino:ka) locale(vino:kk) locale(vino:km) locale(vino:kn) locale(vino:ko) locale(vino:lt) locale(vino:lv) locale(vino:mai) locale(vino:mk) locale(vino:ml) locale(vino:mr) locale(vino:ms) locale(vino:nb) locale(vino:ne) locale(vino:nl) locale(vino:nn) locale(vino:oc) locale(vino:or) locale(vino:pa) locale(vino:pl) locale(vino:pt) locale(vino:pt_BR) locale(vino:ro) locale(vino:ru) locale(vino:si) locale(vino:sk) locale(vino:sl) locale(vino:sq) locale(vino:sr) locale(vino:sr@latin) locale(vino:sv) locale(vino:ta) locale(vino:te) locale(vino:th) locale(vino:tr) locale(vino:ug) locale(vino:uk) locale(vino:vi) locale(vino:wa) locale(vino:zh_CN) locale(vino:zh_HK) locale(vino:zh_TW) vino-lang vino-lang-all"
RDEPENDS:${PN} += "vino"

inherit rpm

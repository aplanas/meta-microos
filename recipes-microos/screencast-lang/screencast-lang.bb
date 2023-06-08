SUMMARY = "Translations for package screencast"
DESCRIPTION = "Provides translations for the 'screencast' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "screencast-lang-1.0.0-2.10.noarch.rpm"
RPM_HASH = "c751d97f29c394c3f7fbfbbcebf283c1621d06b3f11191fb3f7e602e44e530bbbdff2856523df19013336a08aa685fdae9bb09c1aec2421dcabd69266704dd0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(screencast:af) locale(screencast:ar) locale(screencast:as) locale(screencast:ast) locale(screencast:az) locale(screencast:be) locale(screencast:bg) locale(screencast:bn) locale(screencast:br) locale(screencast:bs) locale(screencast:ca) locale(screencast:cs) locale(screencast:cy) locale(screencast:da) locale(screencast:de) locale(screencast:dz) locale(screencast:el) locale(screencast:en_AU) locale(screencast:en_CA) locale(screencast:en_GB) locale(screencast:eo) locale(screencast:es) locale(screencast:et) locale(screencast:eu) locale(screencast:fa) locale(screencast:fi) locale(screencast:fr) locale(screencast:fr_CA) locale(screencast:ga) locale(screencast:gd) locale(screencast:gl) locale(screencast:gu) locale(screencast:he) locale(screencast:hi) locale(screencast:hr) locale(screencast:hu) locale(screencast:ia) locale(screencast:id) locale(screencast:is) locale(screencast:it) locale(screencast:ja) locale(screencast:ka) locale(screencast:kk) locale(screencast:km) locale(screencast:kn) locale(screencast:ko) locale(screencast:lt) locale(screencast:lv) locale(screencast:mk) locale(screencast:ml) locale(screencast:mr) locale(screencast:ms) locale(screencast:nb) locale(screencast:ne) locale(screencast:nl) locale(screencast:nn) locale(screencast:oc) locale(screencast:or) locale(screencast:pa) locale(screencast:pl) locale(screencast:pt) locale(screencast:pt_BR) locale(screencast:ro) locale(screencast:ru) locale(screencast:si) locale(screencast:sk) locale(screencast:sl) locale(screencast:sq) locale(screencast:sr) locale(screencast:sv) locale(screencast:ta) locale(screencast:te) locale(screencast:th) locale(screencast:tr) locale(screencast:ug) locale(screencast:uk) locale(screencast:vi) locale(screencast:wa) locale(screencast:zh) locale(screencast:zh_HK) locale(screencast:zh_TW) screencast-lang screencast-lang-all"
RDEPENDS:${PN} += "screencast"

inherit rpm

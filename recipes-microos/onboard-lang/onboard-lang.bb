SUMMARY = "Translations for package onboard"
DESCRIPTION = "Provides translations for the 'onboard' package."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "onboard-lang-1.4.1-7.6.noarch.rpm"
RPM_HASH = "f28d6eb3ae58a7934cbdfee73301dc360ca3d25b384257af97563eabe23e362ea7d057d7815b9045ba353147f6336eec0e55a9150cf81f358b771f388d782af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(onboard:af) locale(onboard:ar) locale(onboard:ast) locale(onboard:az) locale(onboard:be) locale(onboard:bg) locale(onboard:bn) locale(onboard:br) locale(onboard:bs) locale(onboard:ca) locale(onboard:ca@valencia) locale(onboard:cs) locale(onboard:cy) locale(onboard:da) locale(onboard:de) locale(onboard:el) locale(onboard:en_AU) locale(onboard:en_CA) locale(onboard:en_GB) locale(onboard:eo) locale(onboard:es) locale(onboard:et) locale(onboard:eu) locale(onboard:fa) locale(onboard:fi) locale(onboard:fr) locale(onboard:fr_CA) locale(onboard:ga) locale(onboard:gd) locale(onboard:gl) locale(onboard:he) locale(onboard:hi) locale(onboard:hr) locale(onboard:hu) locale(onboard:ia) locale(onboard:id) locale(onboard:is) locale(onboard:it) locale(onboard:ja) locale(onboard:kk) locale(onboard:km) locale(onboard:kn) locale(onboard:ko) locale(onboard:lt) locale(onboard:lv) locale(onboard:ml) locale(onboard:mr) locale(onboard:ms) locale(onboard:nb) locale(onboard:ne) locale(onboard:nl) locale(onboard:nn) locale(onboard:oc) locale(onboard:pa) locale(onboard:pl) locale(onboard:pt) locale(onboard:pt_BR) locale(onboard:ro) locale(onboard:ru) locale(onboard:si) locale(onboard:sk) locale(onboard:sl) locale(onboard:sq) locale(onboard:sr) locale(onboard:sv) locale(onboard:ta) locale(onboard:te) locale(onboard:th) locale(onboard:tr) locale(onboard:ug) locale(onboard:uk) locale(onboard:vi) locale(onboard:zh_CN) locale(onboard:zh_HK) locale(onboard:zh_TW) onboard-lang onboard-lang-all"
RDEPENDS:${PN} += "onboard"

inherit rpm

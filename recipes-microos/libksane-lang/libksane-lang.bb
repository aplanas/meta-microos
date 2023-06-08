SUMMARY = "Translations for package libksane"
DESCRIPTION = "Provides translations for the 'libksane' package."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libksane-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "853da91638f4fb2068b7e8022382500fe364201b64c8c6a00213014ae1542995255d86733ed0f1341c68c1c96299ccc9991194b784a9000218decd0457451101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libksane-lang libksane-lang-all locale(libksane:ar) locale(libksane:be) locale(libksane:bg) locale(libksane:bs) locale(libksane:ca) locale(libksane:ca@valencia) locale(libksane:cs) locale(libksane:da) locale(libksane:de) locale(libksane:el) locale(libksane:en_GB) locale(libksane:eo) locale(libksane:es) locale(libksane:et) locale(libksane:eu) locale(libksane:fi) locale(libksane:fr) locale(libksane:ga) locale(libksane:gl) locale(libksane:hi) locale(libksane:hr) locale(libksane:hu) locale(libksane:ia) locale(libksane:id) locale(libksane:is) locale(libksane:it) locale(libksane:ja) locale(libksane:ka) locale(libksane:kk) locale(libksane:km) locale(libksane:ko) locale(libksane:lt) locale(libksane:lv) locale(libksane:ml) locale(libksane:mr) locale(libksane:nb) locale(libksane:nds) locale(libksane:nl) locale(libksane:nn) locale(libksane:oc) locale(libksane:pa) locale(libksane:pl) locale(libksane:pt) locale(libksane:pt_BR) locale(libksane:ro) locale(libksane:ru) locale(libksane:sk) locale(libksane:sl) locale(libksane:sq) locale(libksane:sv) locale(libksane:th) locale(libksane:tr) locale(libksane:ug) locale(libksane:uk) locale(libksane:wa) locale(libksane:zh_CN) locale(libksane:zh_TW)"
RDEPENDS:${PN} += "libksane"

inherit rpm

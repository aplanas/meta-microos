SUMMARY = "Translations for package kiten"
DESCRIPTION = "Provides translations for the 'kiten' package."
LICENSE = "GPL-2.0-or-later & CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "23.04.0"

RPM_NAME = "kiten-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "69715369eba5f89d75ff6a7fc1543480653b2e00bbcfb12a8ee3ad34b9053a63e6b85c066cba4d3eca1d3fa2ad29f1ad41752a7ba63d469aff84eed7b1f073c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiten-lang kiten-lang-all locale(kiten:af) locale(kiten:ar) locale(kiten:be) locale(kiten:bg) locale(kiten:br) locale(kiten:bs) locale(kiten:ca) locale(kiten:ca@valencia) locale(kiten:cs) locale(kiten:cy) locale(kiten:da) locale(kiten:de) locale(kiten:el) locale(kiten:en_GB) locale(kiten:eo) locale(kiten:es) locale(kiten:et) locale(kiten:eu) locale(kiten:fa) locale(kiten:fi) locale(kiten:fr) locale(kiten:ga) locale(kiten:gl) locale(kiten:hi) locale(kiten:hr) locale(kiten:hu) locale(kiten:is) locale(kiten:it) locale(kiten:ja) locale(kiten:ka) locale(kiten:kk) locale(kiten:km) locale(kiten:ko) locale(kiten:lt) locale(kiten:lv) locale(kiten:mk) locale(kiten:ml) locale(kiten:mr) locale(kiten:ms) locale(kiten:nb) locale(kiten:nds) locale(kiten:ne) locale(kiten:nl) locale(kiten:nn) locale(kiten:oc) locale(kiten:pl) locale(kiten:pt) locale(kiten:pt_BR) locale(kiten:ro) locale(kiten:ru) locale(kiten:si) locale(kiten:sk) locale(kiten:sl) locale(kiten:sq) locale(kiten:sv) locale(kiten:ta) locale(kiten:tr) locale(kiten:ug) locale(kiten:uk) locale(kiten:zh_CN) locale(kiten:zh_TW)"
RDEPENDS:${PN} += "kiten"

inherit rpm

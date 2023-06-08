SUMMARY = "Translations for package kalzium"
DESCRIPTION = "Provides translations for the 'kalzium' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kalzium-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6f76a8dbd62516e814dabc0ed6d7a6b6fe9dd04a176d6c9a0c60788b36167efce9f7a16000412eb450ed6d89000ac9665a1b4d6ceb349904b562404ab64f607a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalzium-lang kalzium-lang-all locale(kalzium:af) locale(kalzium:ar) locale(kalzium:be) locale(kalzium:bg) locale(kalzium:bn) locale(kalzium:br) locale(kalzium:bs) locale(kalzium:ca) locale(kalzium:ca@valencia) locale(kalzium:cs) locale(kalzium:cy) locale(kalzium:da) locale(kalzium:de) locale(kalzium:el) locale(kalzium:en_GB) locale(kalzium:eo) locale(kalzium:es) locale(kalzium:et) locale(kalzium:eu) locale(kalzium:fa) locale(kalzium:fi) locale(kalzium:fr) locale(kalzium:ga) locale(kalzium:gl) locale(kalzium:gu) locale(kalzium:he) locale(kalzium:hi) locale(kalzium:hr) locale(kalzium:hu) locale(kalzium:is) locale(kalzium:it) locale(kalzium:ja) locale(kalzium:ka) locale(kalzium:kk) locale(kalzium:km) locale(kalzium:ko) locale(kalzium:lt) locale(kalzium:lv) locale(kalzium:mai) locale(kalzium:mk) locale(kalzium:ml) locale(kalzium:mr) locale(kalzium:ms) locale(kalzium:nb) locale(kalzium:nds) locale(kalzium:ne) locale(kalzium:nl) locale(kalzium:nn) locale(kalzium:oc) locale(kalzium:pa) locale(kalzium:pl) locale(kalzium:pt) locale(kalzium:pt_BR) locale(kalzium:ro) locale(kalzium:ru) locale(kalzium:si) locale(kalzium:sk) locale(kalzium:sl) locale(kalzium:sq) locale(kalzium:sv) locale(kalzium:ta) locale(kalzium:th) locale(kalzium:tr) locale(kalzium:ug) locale(kalzium:uk) locale(kalzium:zh_CN) locale(kalzium:zh_TW)"
RDEPENDS:${PN} += "kalzium"

inherit rpm

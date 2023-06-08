SUMMARY = "Translations for package kteatime"
DESCRIPTION = "Provides translations for the 'kteatime' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kteatime-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6f86234dc6f657a14a98a9a54c04c6e4d2cb4349ec8d1885cf8ac184b983850d40e036e8fc42809712f4b0d4b40cd3a0280965557bd0aaaf7b5b33d1dd533bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kteatime-lang kteatime-lang-all locale(kteatime:af) locale(kteatime:ar) locale(kteatime:be) locale(kteatime:bg) locale(kteatime:bn) locale(kteatime:br) locale(kteatime:bs) locale(kteatime:ca) locale(kteatime:ca@valencia) locale(kteatime:cs) locale(kteatime:cy) locale(kteatime:da) locale(kteatime:de) locale(kteatime:el) locale(kteatime:en_GB) locale(kteatime:eo) locale(kteatime:es) locale(kteatime:et) locale(kteatime:eu) locale(kteatime:fa) locale(kteatime:fi) locale(kteatime:fr) locale(kteatime:ga) locale(kteatime:gl) locale(kteatime:he) locale(kteatime:hi) locale(kteatime:hr) locale(kteatime:hu) locale(kteatime:ia) locale(kteatime:is) locale(kteatime:it) locale(kteatime:ja) locale(kteatime:ka) locale(kteatime:kk) locale(kteatime:km) locale(kteatime:ko) locale(kteatime:lt) locale(kteatime:lv) locale(kteatime:mk) locale(kteatime:ml) locale(kteatime:mr) locale(kteatime:ms) locale(kteatime:nb) locale(kteatime:nds) locale(kteatime:ne) locale(kteatime:nl) locale(kteatime:nn) locale(kteatime:oc) locale(kteatime:pa) locale(kteatime:pl) locale(kteatime:pt) locale(kteatime:pt_BR) locale(kteatime:ro) locale(kteatime:ru) locale(kteatime:sk) locale(kteatime:sl) locale(kteatime:sr) locale(kteatime:sr@ijekavian) locale(kteatime:sr@ijekavianlatin) locale(kteatime:sr@latin) locale(kteatime:sv) locale(kteatime:ta) locale(kteatime:th) locale(kteatime:tr) locale(kteatime:ug) locale(kteatime:uk) locale(kteatime:wa) locale(kteatime:zh_CN) locale(kteatime:zh_TW)"
RDEPENDS:${PN} += "kteatime"

inherit rpm

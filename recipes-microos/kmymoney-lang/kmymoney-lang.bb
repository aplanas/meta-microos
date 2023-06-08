SUMMARY = "Translations for package kmymoney"
DESCRIPTION = "Provides translations for the 'kmymoney' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.1.3"

RPM_NAME = "kmymoney-lang-5.1.3-2.9.noarch.rpm"
RPM_HASH = "dcb6f41f84dd6af012097fe8ed6396fbfc73bed40e14ab0550401afd56f4fbd3276c1dec58689a92467d2c292fdaecd38917f114621e8abd447e57c52e0346f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmymoney-lang kmymoney-lang-all locale(kmymoney:ar) locale(kmymoney:ast) locale(kmymoney:bg) locale(kmymoney:bs) locale(kmymoney:ca) locale(kmymoney:ca@valencia) locale(kmymoney:cs) locale(kmymoney:da) locale(kmymoney:de) locale(kmymoney:el) locale(kmymoney:en_GB) locale(kmymoney:eo) locale(kmymoney:es) locale(kmymoney:et) locale(kmymoney:eu) locale(kmymoney:fi) locale(kmymoney:fr) locale(kmymoney:ga) locale(kmymoney:gl) locale(kmymoney:hu) locale(kmymoney:ia) locale(kmymoney:it) locale(kmymoney:kk) locale(kmymoney:ko) locale(kmymoney:lt) locale(kmymoney:mr) locale(kmymoney:ms) locale(kmymoney:nds) locale(kmymoney:nl) locale(kmymoney:pl) locale(kmymoney:pt) locale(kmymoney:pt_BR) locale(kmymoney:ro) locale(kmymoney:ru) locale(kmymoney:sk) locale(kmymoney:sl) locale(kmymoney:sv) locale(kmymoney:tr) locale(kmymoney:ug) locale(kmymoney:uk) locale(kmymoney:zh_CN) locale(kmymoney:zh_TW)"
RDEPENDS:${PN} += "kmymoney"

inherit rpm

SUMMARY = "Translations for package kscreenlocker"
DESCRIPTION = "Provides translations for the 'kscreenlocker' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kscreenlocker-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "18a72cde85da2d6d99c2578e529f894ef706ab01d3b5c2432a69dec9b28996d1090867e4e5d06852c42fc036a8d21f48e2743e163619f43a67dcdce0e5df4619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kscreenlocker-lang kscreenlocker-lang-all locale(kscreenlocker:ar) locale(kscreenlocker:az) locale(kscreenlocker:bg) locale(kscreenlocker:bs) locale(kscreenlocker:ca) locale(kscreenlocker:ca@valencia) locale(kscreenlocker:cs) locale(kscreenlocker:da) locale(kscreenlocker:de) locale(kscreenlocker:el) locale(kscreenlocker:en_GB) locale(kscreenlocker:es) locale(kscreenlocker:et) locale(kscreenlocker:eu) locale(kscreenlocker:fi) locale(kscreenlocker:fr) locale(kscreenlocker:ga) locale(kscreenlocker:gl) locale(kscreenlocker:he) locale(kscreenlocker:hi) locale(kscreenlocker:hu) locale(kscreenlocker:ia) locale(kscreenlocker:id) locale(kscreenlocker:it) locale(kscreenlocker:ja) locale(kscreenlocker:ka) locale(kscreenlocker:kk) locale(kscreenlocker:ko) locale(kscreenlocker:lt) locale(kscreenlocker:lv) locale(kscreenlocker:mr) locale(kscreenlocker:nb) locale(kscreenlocker:nds) locale(kscreenlocker:nl) locale(kscreenlocker:nn) locale(kscreenlocker:pa) locale(kscreenlocker:pl) locale(kscreenlocker:pt) locale(kscreenlocker:pt_BR) locale(kscreenlocker:ro) locale(kscreenlocker:ru) locale(kscreenlocker:sk) locale(kscreenlocker:sl) locale(kscreenlocker:sr) locale(kscreenlocker:sr@ijekavian) locale(kscreenlocker:sr@ijekavianlatin) locale(kscreenlocker:sr@latin) locale(kscreenlocker:sv) locale(kscreenlocker:ta) locale(kscreenlocker:tr) locale(kscreenlocker:ug) locale(kscreenlocker:uk) locale(kscreenlocker:wa) locale(kscreenlocker:zh_CN) locale(kscreenlocker:zh_TW)"
RDEPENDS:${PN} += "kscreenlocker"

inherit rpm

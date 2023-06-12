SUMMARY = "Translations for package kblocks"
DESCRIPTION = "Provides translations for the 'kblocks' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kblocks-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "77378cbd367976fd3254115009da6ab31bc3770e6b7fb7985bd5bf5b92fe70a661d48cb34cd8fc4d2118f1fe6237c04d98e955e94f3ab6146a357999765b63c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kblocks-lang kblocks-lang-all locale(kblocks:ar) locale(kblocks:bg) locale(kblocks:bs) locale(kblocks:ca) locale(kblocks:ca@valencia) locale(kblocks:cs) locale(kblocks:da) locale(kblocks:de) locale(kblocks:el) locale(kblocks:en_GB) locale(kblocks:eo) locale(kblocks:es) locale(kblocks:et) locale(kblocks:eu) locale(kblocks:fi) locale(kblocks:fr) locale(kblocks:ga) locale(kblocks:gl) locale(kblocks:gu) locale(kblocks:hi) locale(kblocks:hr) locale(kblocks:hu) locale(kblocks:id) locale(kblocks:is) locale(kblocks:it) locale(kblocks:ja) locale(kblocks:ka) locale(kblocks:kk) locale(kblocks:km) locale(kblocks:ko) locale(kblocks:lt) locale(kblocks:lv) locale(kblocks:mai) locale(kblocks:ml) locale(kblocks:mr) locale(kblocks:nb) locale(kblocks:nds) locale(kblocks:nl) locale(kblocks:nn) locale(kblocks:pl) locale(kblocks:pt) locale(kblocks:pt_BR) locale(kblocks:ro) locale(kblocks:ru) locale(kblocks:sk) locale(kblocks:sl) locale(kblocks:sq) locale(kblocks:sr) locale(kblocks:sr@ijekavian) locale(kblocks:sr@ijekavianlatin) locale(kblocks:sr@latin) locale(kblocks:sv) locale(kblocks:th) locale(kblocks:tr) locale(kblocks:ug) locale(kblocks:uk) locale(kblocks:zh_CN) locale(kblocks:zh_TW)"
RDEPENDS:${PN} += "kblocks"

inherit rpm

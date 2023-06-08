SUMMARY = "Translations for package kmailtransport"
DESCRIPTION = "Provides translations for the 'kmailtransport' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kmailtransport-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "5d05414aa1a2f31c7e924bb686a5e6bae6117a7eb1fad24136ce0bcf20e0ea48afa458dd3ace1f1eb9d8a3f3438c12bb95f40ab1df42cb01633737305d3b220f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmailtransport-lang kmailtransport-lang-all locale(kmailtransport:ar) locale(kmailtransport:be) locale(kmailtransport:bg) locale(kmailtransport:bs) locale(kmailtransport:ca) locale(kmailtransport:ca@valencia) locale(kmailtransport:cs) locale(kmailtransport:da) locale(kmailtransport:de) locale(kmailtransport:el) locale(kmailtransport:en_GB) locale(kmailtransport:eo) locale(kmailtransport:es) locale(kmailtransport:et) locale(kmailtransport:eu) locale(kmailtransport:fi) locale(kmailtransport:fr) locale(kmailtransport:ga) locale(kmailtransport:gl) locale(kmailtransport:hi) locale(kmailtransport:hu) locale(kmailtransport:ia) locale(kmailtransport:it) locale(kmailtransport:ja) locale(kmailtransport:ka) locale(kmailtransport:kk) locale(kmailtransport:km) locale(kmailtransport:ko) locale(kmailtransport:lt) locale(kmailtransport:lv) locale(kmailtransport:mai) locale(kmailtransport:mr) locale(kmailtransport:nb) locale(kmailtransport:nds) locale(kmailtransport:nl) locale(kmailtransport:nn) locale(kmailtransport:pa) locale(kmailtransport:pl) locale(kmailtransport:pt) locale(kmailtransport:pt_BR) locale(kmailtransport:ro) locale(kmailtransport:ru) locale(kmailtransport:sk) locale(kmailtransport:sl) locale(kmailtransport:sr) locale(kmailtransport:sr@ijekavian) locale(kmailtransport:sr@ijekavianlatin) locale(kmailtransport:sr@latin) locale(kmailtransport:sv) locale(kmailtransport:th) locale(kmailtransport:tr) locale(kmailtransport:ug) locale(kmailtransport:uk) locale(kmailtransport:zh_CN) locale(kmailtransport:zh_TW)"
RDEPENDS:${PN} += "kmailtransport"

inherit rpm

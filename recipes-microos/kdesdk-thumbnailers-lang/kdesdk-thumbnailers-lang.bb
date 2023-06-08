SUMMARY = "Translations for package kdesdk-thumbnailers"
DESCRIPTION = "Provides translations for the 'kdesdk-thumbnailers' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdesdk-thumbnailers-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "be967ec8ae0b95a4feac4fcac7e2581b5f55fffcf9dfa486f4b57c489c364eb0b38e14351d63a172a8cfbc54604adf38009d10074050b721ec52d3933c3733c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdesdk-thumbnailers-lang kdesdk-thumbnailers-lang-all locale(kdesdk-thumbnailers:ar) locale(kdesdk-thumbnailers:bg) locale(kdesdk-thumbnailers:bs) locale(kdesdk-thumbnailers:ca) locale(kdesdk-thumbnailers:ca@valencia) locale(kdesdk-thumbnailers:cs) locale(kdesdk-thumbnailers:da) locale(kdesdk-thumbnailers:de) locale(kdesdk-thumbnailers:el) locale(kdesdk-thumbnailers:en_GB) locale(kdesdk-thumbnailers:es) locale(kdesdk-thumbnailers:et) locale(kdesdk-thumbnailers:eu) locale(kdesdk-thumbnailers:fi) locale(kdesdk-thumbnailers:fr) locale(kdesdk-thumbnailers:ga) locale(kdesdk-thumbnailers:gl) locale(kdesdk-thumbnailers:hi) locale(kdesdk-thumbnailers:hu) locale(kdesdk-thumbnailers:is) locale(kdesdk-thumbnailers:it) locale(kdesdk-thumbnailers:ja) locale(kdesdk-thumbnailers:ka) locale(kdesdk-thumbnailers:kk) locale(kdesdk-thumbnailers:ko) locale(kdesdk-thumbnailers:lt) locale(kdesdk-thumbnailers:mr) locale(kdesdk-thumbnailers:nb) locale(kdesdk-thumbnailers:nds) locale(kdesdk-thumbnailers:nl) locale(kdesdk-thumbnailers:nn) locale(kdesdk-thumbnailers:pa) locale(kdesdk-thumbnailers:pl) locale(kdesdk-thumbnailers:pt) locale(kdesdk-thumbnailers:pt_BR) locale(kdesdk-thumbnailers:ro) locale(kdesdk-thumbnailers:ru) locale(kdesdk-thumbnailers:sk) locale(kdesdk-thumbnailers:sl) locale(kdesdk-thumbnailers:sv) locale(kdesdk-thumbnailers:tr) locale(kdesdk-thumbnailers:ug) locale(kdesdk-thumbnailers:uk) locale(kdesdk-thumbnailers:vi) locale(kdesdk-thumbnailers:zh_CN) locale(kdesdk-thumbnailers:zh_TW)"
RDEPENDS:${PN} += "kdesdk-thumbnailers"

inherit rpm

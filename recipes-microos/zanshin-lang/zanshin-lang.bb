SUMMARY = "Translations for package zanshin"
DESCRIPTION = "Provides translations for the 'zanshin' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "zanshin-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "8e118b92e1dcb32fde914eacf60ada598bb4a73c8f859a7a95e261d3e4d8ffa3328c984254575eed1138f0aec2ca689c0a5ff6d6be81b2315f3749aa4c949024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(zanshin:bg) locale(zanshin:bs) locale(zanshin:ca) locale(zanshin:ca@valencia) locale(zanshin:cs) locale(zanshin:da) locale(zanshin:de) locale(zanshin:en_GB) locale(zanshin:es) locale(zanshin:et) locale(zanshin:eu) locale(zanshin:fi) locale(zanshin:fr) locale(zanshin:ga) locale(zanshin:gl) locale(zanshin:hu) locale(zanshin:ia) locale(zanshin:it) locale(zanshin:ja) locale(zanshin:ka) locale(zanshin:ko) locale(zanshin:lt) locale(zanshin:mr) locale(zanshin:nb) locale(zanshin:nds) locale(zanshin:nl) locale(zanshin:nn) locale(zanshin:pl) locale(zanshin:pt) locale(zanshin:pt_BR) locale(zanshin:ru) locale(zanshin:sk) locale(zanshin:sl) locale(zanshin:sv) locale(zanshin:tr) locale(zanshin:ug) locale(zanshin:uk) locale(zanshin:zh_CN) locale(zanshin:zh_TW) zanshin-lang zanshin-lang-all"
RDEPENDS:${PN} += "zanshin"

inherit rpm

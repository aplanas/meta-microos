SUMMARY = "Translations for package zanshin"
DESCRIPTION = "Provides translations for the 'zanshin' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "zanshin-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "47387d07091afa8a1bdd472fdb8abbb2628c8ecce22853cea686c880bf64eb36b75dad5032934861a9eff8efc1527f88cb350b77823a71fac24a4a17e2c0af78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(zanshin:bg) locale(zanshin:bs) locale(zanshin:ca) locale(zanshin:ca@valencia) locale(zanshin:cs) locale(zanshin:da) locale(zanshin:de) locale(zanshin:en_GB) locale(zanshin:es) locale(zanshin:et) locale(zanshin:eu) locale(zanshin:fi) locale(zanshin:fr) locale(zanshin:ga) locale(zanshin:gl) locale(zanshin:hu) locale(zanshin:ia) locale(zanshin:it) locale(zanshin:ja) locale(zanshin:ka) locale(zanshin:ko) locale(zanshin:lt) locale(zanshin:mr) locale(zanshin:nb) locale(zanshin:nds) locale(zanshin:nl) locale(zanshin:nn) locale(zanshin:pl) locale(zanshin:pt) locale(zanshin:pt_BR) locale(zanshin:ru) locale(zanshin:sk) locale(zanshin:sl) locale(zanshin:sv) locale(zanshin:tr) locale(zanshin:ug) locale(zanshin:uk) locale(zanshin:zh_CN) locale(zanshin:zh_TW) zanshin-lang zanshin-lang-all"
RDEPENDS:${PN} += "zanshin"

inherit rpm

SUMMARY = "Translations for package pimcommon"
DESCRIPTION = "Provides translations for the 'pimcommon' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "pimcommon-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "15f158818c4c8b90466bb8928950c99319b7e428581c2bbf0af0a9aeca84c2190ed2ec136f8f0e40db510b617479f9630f97f03f4334a98917b5cfcb0760bd12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pimcommon:ar) locale(pimcommon:bs) locale(pimcommon:ca) locale(pimcommon:ca@valencia) locale(pimcommon:cs) locale(pimcommon:da) locale(pimcommon:de) locale(pimcommon:el) locale(pimcommon:en_GB) locale(pimcommon:es) locale(pimcommon:et) locale(pimcommon:eu) locale(pimcommon:fi) locale(pimcommon:fr) locale(pimcommon:ga) locale(pimcommon:gl) locale(pimcommon:hu) locale(pimcommon:ia) locale(pimcommon:it) locale(pimcommon:ja) locale(pimcommon:ka) locale(pimcommon:kk) locale(pimcommon:ko) locale(pimcommon:lt) locale(pimcommon:mr) locale(pimcommon:nb) locale(pimcommon:nds) locale(pimcommon:nl) locale(pimcommon:pl) locale(pimcommon:pt) locale(pimcommon:pt_BR) locale(pimcommon:ro) locale(pimcommon:ru) locale(pimcommon:sk) locale(pimcommon:sl) locale(pimcommon:sr) locale(pimcommon:sr@ijekavian) locale(pimcommon:sr@ijekavianlatin) locale(pimcommon:sr@latin) locale(pimcommon:sv) locale(pimcommon:tr) locale(pimcommon:ug) locale(pimcommon:uk) locale(pimcommon:zh_CN) locale(pimcommon:zh_TW) pimcommon-lang pimcommon-lang-all"
RDEPENDS:${PN} += "pimcommon"

inherit rpm

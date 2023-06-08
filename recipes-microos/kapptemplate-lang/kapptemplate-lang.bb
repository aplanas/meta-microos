SUMMARY = "Translations for package kapptemplate"
DESCRIPTION = "Provides translations for the 'kapptemplate' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.0"

RPM_NAME = "kapptemplate-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "7fd1b24d3c00cf60cb144b1f2379ac254c1fe27c808a3dea1d732d82804961c1e4a7b90d3f3c7ce46e34c06d8407ec97677a91de1e9785b740f79ecac618960c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kapptemplate-lang kapptemplate-lang-all locale(kapptemplate:bg) locale(kapptemplate:bs) locale(kapptemplate:ca) locale(kapptemplate:ca@valencia) locale(kapptemplate:cs) locale(kapptemplate:da) locale(kapptemplate:de) locale(kapptemplate:el) locale(kapptemplate:en_GB) locale(kapptemplate:eo) locale(kapptemplate:es) locale(kapptemplate:et) locale(kapptemplate:eu) locale(kapptemplate:fi) locale(kapptemplate:fr) locale(kapptemplate:ga) locale(kapptemplate:gl) locale(kapptemplate:hu) locale(kapptemplate:it) locale(kapptemplate:ja) locale(kapptemplate:ka) locale(kapptemplate:kk) locale(kapptemplate:ko) locale(kapptemplate:lt) locale(kapptemplate:lv) locale(kapptemplate:mr) locale(kapptemplate:nb) locale(kapptemplate:nds) locale(kapptemplate:nl) locale(kapptemplate:nn) locale(kapptemplate:pl) locale(kapptemplate:pt) locale(kapptemplate:pt_BR) locale(kapptemplate:ru) locale(kapptemplate:sk) locale(kapptemplate:sl) locale(kapptemplate:sq) locale(kapptemplate:sr) locale(kapptemplate:sr@ijekavian) locale(kapptemplate:sr@ijekavianlatin) locale(kapptemplate:sr@latin) locale(kapptemplate:sv) locale(kapptemplate:th) locale(kapptemplate:tr) locale(kapptemplate:ug) locale(kapptemplate:uk) locale(kapptemplate:zh_CN) locale(kapptemplate:zh_TW)"
RDEPENDS:${PN} += "kapptemplate"

inherit rpm

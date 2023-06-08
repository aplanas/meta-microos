SUMMARY = "Translations for package kpmcore"
DESCRIPTION = "Provides translations for the 'kpmcore' package."
LICENSE = "GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "kpmcore-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "bdd6f0acd6071917b2dcf3ec3c4b8ff6c95cfc1812a927dbe450e1559a3e073707770f09b6be879a23dc4e9748d8981ed2d650183acd6d5dd08f1ff48e394e02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpmcore-lang kpmcore-lang-all locale(kpmcore:ar) locale(kpmcore:bg) locale(kpmcore:bs) locale(kpmcore:ca) locale(kpmcore:ca@valencia) locale(kpmcore:cs) locale(kpmcore:da) locale(kpmcore:de) locale(kpmcore:el) locale(kpmcore:en_GB) locale(kpmcore:eo) locale(kpmcore:es) locale(kpmcore:et) locale(kpmcore:eu) locale(kpmcore:fi) locale(kpmcore:fr) locale(kpmcore:ga) locale(kpmcore:gl) locale(kpmcore:hr) locale(kpmcore:hu) locale(kpmcore:id) locale(kpmcore:is) locale(kpmcore:it) locale(kpmcore:ja) locale(kpmcore:ka) locale(kpmcore:ko) locale(kpmcore:lt) locale(kpmcore:lv) locale(kpmcore:mai) locale(kpmcore:mr) locale(kpmcore:nb) locale(kpmcore:nds) locale(kpmcore:nl) locale(kpmcore:nn) locale(kpmcore:pa) locale(kpmcore:pl) locale(kpmcore:pt) locale(kpmcore:pt_BR) locale(kpmcore:ro) locale(kpmcore:ru) locale(kpmcore:sk) locale(kpmcore:sl) locale(kpmcore:sr) locale(kpmcore:sr@ijekavian) locale(kpmcore:sr@ijekavianlatin) locale(kpmcore:sr@latin) locale(kpmcore:sv) locale(kpmcore:th) locale(kpmcore:tr) locale(kpmcore:ug) locale(kpmcore:uk) locale(kpmcore:zh_CN) locale(kpmcore:zh_TW)"
RDEPENDS:${PN} += "kpmcore"

inherit rpm

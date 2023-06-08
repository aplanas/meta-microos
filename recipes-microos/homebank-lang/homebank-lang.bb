SUMMARY = "Translations for package homebank"
DESCRIPTION = "Provides translations for the 'homebank' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.3"

RPM_NAME = "homebank-lang-5.6.3-1.2.noarch.rpm"
RPM_HASH = "30872becf88dfa1aff50404e79f2609a64cf80adbf080f812569c9f5c0298f267ee671214ef0a298b4fc9886d1c1bc8e7a09180036290bdb4bb98861f3076ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "homebank-lang homebank-lang-all locale(homebank:ar) locale(homebank:ast) locale(homebank:be) locale(homebank:bg) locale(homebank:br) locale(homebank:ca) locale(homebank:cs) locale(homebank:cy) locale(homebank:da) locale(homebank:de) locale(homebank:el) locale(homebank:en_AU) locale(homebank:en_CA) locale(homebank:en_GB) locale(homebank:eo) locale(homebank:es) locale(homebank:et) locale(homebank:eu) locale(homebank:fa) locale(homebank:fi) locale(homebank:fr) locale(homebank:fr_CA) locale(homebank:gl) locale(homebank:he) locale(homebank:hr) locale(homebank:hu) locale(homebank:id) locale(homebank:is) locale(homebank:it) locale(homebank:ja) locale(homebank:ko) locale(homebank:lt) locale(homebank:lv) locale(homebank:ms) locale(homebank:nb) locale(homebank:nds) locale(homebank:nl) locale(homebank:oc) locale(homebank:pl) locale(homebank:pt) locale(homebank:pt_BR) locale(homebank:pt_PT) locale(homebank:ro) locale(homebank:ru) locale(homebank:si) locale(homebank:sk) locale(homebank:sl) locale(homebank:sr) locale(homebank:sv) locale(homebank:ta) locale(homebank:tr) locale(homebank:uk) locale(homebank:vi) locale(homebank:zh_CN) locale(homebank:zh_TW)"
RDEPENDS:${PN} += "homebank"

inherit rpm

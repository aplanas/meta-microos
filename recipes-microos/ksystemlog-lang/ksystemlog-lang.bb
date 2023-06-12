SUMMARY = "Translations for package ksystemlog"
DESCRIPTION = "Provides translations for the 'ksystemlog' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "ksystemlog-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "f671b89ec6fccb1e0f8b483cf326e941dfe28944a02e882c9ef0d9c6803e3b438aa26adcd52bfd76262ad6b9c65fec685de0c5d6192e11db2f8e746b34f00273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksystemlog-lang ksystemlog-lang-all locale(ksystemlog:ar) locale(ksystemlog:az) locale(ksystemlog:be) locale(ksystemlog:bg) locale(ksystemlog:br) locale(ksystemlog:bs) locale(ksystemlog:ca) locale(ksystemlog:ca@valencia) locale(ksystemlog:cs) locale(ksystemlog:cy) locale(ksystemlog:da) locale(ksystemlog:de) locale(ksystemlog:el) locale(ksystemlog:en_GB) locale(ksystemlog:eo) locale(ksystemlog:es) locale(ksystemlog:et) locale(ksystemlog:eu) locale(ksystemlog:fi) locale(ksystemlog:fr) locale(ksystemlog:ga) locale(ksystemlog:gl) locale(ksystemlog:hr) locale(ksystemlog:hu) locale(ksystemlog:ia) locale(ksystemlog:is) locale(ksystemlog:it) locale(ksystemlog:ja) locale(ksystemlog:ka) locale(ksystemlog:kk) locale(ksystemlog:km) locale(ksystemlog:ko) locale(ksystemlog:lt) locale(ksystemlog:lv) locale(ksystemlog:mr) locale(ksystemlog:nb) locale(ksystemlog:nds) locale(ksystemlog:nl) locale(ksystemlog:nn) locale(ksystemlog:oc) locale(ksystemlog:pa) locale(ksystemlog:pl) locale(ksystemlog:pt) locale(ksystemlog:pt_BR) locale(ksystemlog:ro) locale(ksystemlog:ru) locale(ksystemlog:sk) locale(ksystemlog:sl) locale(ksystemlog:sr) locale(ksystemlog:sr@ijekavian) locale(ksystemlog:sr@ijekavianlatin) locale(ksystemlog:sr@latin) locale(ksystemlog:sv) locale(ksystemlog:th) locale(ksystemlog:tr) locale(ksystemlog:ug) locale(ksystemlog:uk) locale(ksystemlog:zh_CN) locale(ksystemlog:zh_TW)"
RDEPENDS:${PN} += "ksystemlog"

inherit rpm

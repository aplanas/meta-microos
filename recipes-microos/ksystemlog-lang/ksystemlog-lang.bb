SUMMARY = "Translations for package ksystemlog"
DESCRIPTION = "Provides translations for the 'ksystemlog' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "ksystemlog-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "1a633f585a9bbd0ebf3fe910bc666c7c3e1bc16d7e1d5afe6051c7e87e411a8cd184549b946c0727513307fc890b8647a0a2ac31638a675b34ca8bdaf1ee31e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksystemlog-lang ksystemlog-lang-all locale(ksystemlog:ar) locale(ksystemlog:az) locale(ksystemlog:be) locale(ksystemlog:bg) locale(ksystemlog:br) locale(ksystemlog:bs) locale(ksystemlog:ca) locale(ksystemlog:ca@valencia) locale(ksystemlog:cs) locale(ksystemlog:cy) locale(ksystemlog:da) locale(ksystemlog:de) locale(ksystemlog:el) locale(ksystemlog:en_GB) locale(ksystemlog:eo) locale(ksystemlog:es) locale(ksystemlog:et) locale(ksystemlog:eu) locale(ksystemlog:fi) locale(ksystemlog:fr) locale(ksystemlog:ga) locale(ksystemlog:gl) locale(ksystemlog:hr) locale(ksystemlog:hu) locale(ksystemlog:ia) locale(ksystemlog:is) locale(ksystemlog:it) locale(ksystemlog:ja) locale(ksystemlog:ka) locale(ksystemlog:kk) locale(ksystemlog:km) locale(ksystemlog:ko) locale(ksystemlog:lt) locale(ksystemlog:lv) locale(ksystemlog:mr) locale(ksystemlog:nb) locale(ksystemlog:nds) locale(ksystemlog:nl) locale(ksystemlog:nn) locale(ksystemlog:oc) locale(ksystemlog:pa) locale(ksystemlog:pl) locale(ksystemlog:pt) locale(ksystemlog:pt_BR) locale(ksystemlog:ro) locale(ksystemlog:ru) locale(ksystemlog:sk) locale(ksystemlog:sl) locale(ksystemlog:sr) locale(ksystemlog:sr@ijekavian) locale(ksystemlog:sr@ijekavianlatin) locale(ksystemlog:sr@latin) locale(ksystemlog:sv) locale(ksystemlog:th) locale(ksystemlog:tr) locale(ksystemlog:ug) locale(ksystemlog:uk) locale(ksystemlog:zh_CN) locale(ksystemlog:zh_TW)"
RDEPENDS:${PN} += "ksystemlog"

inherit rpm

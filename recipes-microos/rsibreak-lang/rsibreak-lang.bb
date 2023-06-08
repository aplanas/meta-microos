SUMMARY = "Translations for package rsibreak"
DESCRIPTION = "Provides translations for the 'rsibreak' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.15"

RPM_NAME = "rsibreak-lang-0.12.15-1.4.noarch.rpm"
RPM_HASH = "622180c3140674633b7d6d7807e8e793279dcecc9a6d356ff12ea5fa8e138cbf8a14c78017a94f056e880716e4ef59c8557afc042c7222ed8f10638bee491e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(rsibreak:ar) locale(rsibreak:be) locale(rsibreak:bs) locale(rsibreak:ca) locale(rsibreak:ca@valencia) locale(rsibreak:cs) locale(rsibreak:da) locale(rsibreak:de) locale(rsibreak:el) locale(rsibreak:en_GB) locale(rsibreak:eo) locale(rsibreak:es) locale(rsibreak:et) locale(rsibreak:fi) locale(rsibreak:fr) locale(rsibreak:ga) locale(rsibreak:gl) locale(rsibreak:hi) locale(rsibreak:hr) locale(rsibreak:hu) locale(rsibreak:ia) locale(rsibreak:id) locale(rsibreak:is) locale(rsibreak:it) locale(rsibreak:ja) locale(rsibreak:km) locale(rsibreak:ko) locale(rsibreak:lt) locale(rsibreak:mai) locale(rsibreak:nb) locale(rsibreak:nds) locale(rsibreak:nl) locale(rsibreak:nn) locale(rsibreak:oc) locale(rsibreak:pl) locale(rsibreak:pt) locale(rsibreak:pt_BR) locale(rsibreak:ro) locale(rsibreak:ru) locale(rsibreak:sk) locale(rsibreak:sl) locale(rsibreak:sv) locale(rsibreak:ta) locale(rsibreak:tr) locale(rsibreak:ug) locale(rsibreak:uk) locale(rsibreak:zh_CN) locale(rsibreak:zh_TW) rsibreak-lang rsibreak-lang-all"
RDEPENDS:${PN} += "rsibreak"

inherit rpm

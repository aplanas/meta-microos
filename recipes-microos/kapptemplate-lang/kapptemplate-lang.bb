SUMMARY = "Translations for package kapptemplate"
DESCRIPTION = "Provides translations for the 'kapptemplate' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kapptemplate-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "9f379b961b17ab0e9eb862590fe75914ad873ece4ef41754213866acb3b946d64cf30c605795c73c76260b76f51043cbe47071b181fd98c87104682f0a994b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kapptemplate-lang kapptemplate-lang-all locale(kapptemplate:bg) locale(kapptemplate:bs) locale(kapptemplate:ca) locale(kapptemplate:ca@valencia) locale(kapptemplate:cs) locale(kapptemplate:da) locale(kapptemplate:de) locale(kapptemplate:el) locale(kapptemplate:en_GB) locale(kapptemplate:eo) locale(kapptemplate:es) locale(kapptemplate:et) locale(kapptemplate:eu) locale(kapptemplate:fi) locale(kapptemplate:fr) locale(kapptemplate:ga) locale(kapptemplate:gl) locale(kapptemplate:hu) locale(kapptemplate:it) locale(kapptemplate:ja) locale(kapptemplate:ka) locale(kapptemplate:kk) locale(kapptemplate:ko) locale(kapptemplate:lt) locale(kapptemplate:lv) locale(kapptemplate:mr) locale(kapptemplate:nb) locale(kapptemplate:nds) locale(kapptemplate:nl) locale(kapptemplate:nn) locale(kapptemplate:pl) locale(kapptemplate:pt) locale(kapptemplate:pt_BR) locale(kapptemplate:ru) locale(kapptemplate:sk) locale(kapptemplate:sl) locale(kapptemplate:sq) locale(kapptemplate:sr) locale(kapptemplate:sr@ijekavian) locale(kapptemplate:sr@ijekavianlatin) locale(kapptemplate:sr@latin) locale(kapptemplate:sv) locale(kapptemplate:th) locale(kapptemplate:tr) locale(kapptemplate:ug) locale(kapptemplate:uk) locale(kapptemplate:zh_CN) locale(kapptemplate:zh_TW)"
RDEPENDS:${PN} += "kapptemplate"

inherit rpm

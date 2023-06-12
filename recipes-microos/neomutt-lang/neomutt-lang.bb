SUMMARY = "Translations for package neomutt"
DESCRIPTION = "Provides translations for the 'neomutt' package."
LICENSE = "GPL-2.0-or-later"

PV = "20230517"

RPM_NAME = "neomutt-lang-20230517-1.1.noarch.rpm"
RPM_HASH = "9c39553e4cdc1bcc50bbf2f06cdde3adb4f9673bcc61b62c01ab0ed3cf0f6b776c6a77ec26ff498b87717ec1d7191de0c10073a7c2adfcf45ff76cf627d67583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(neomutt:bg) locale(neomutt:ca) locale(neomutt:cs) locale(neomutt:da) locale(neomutt:de) locale(neomutt:el) locale(neomutt:en_GB) locale(neomutt:eo) locale(neomutt:es) locale(neomutt:et) locale(neomutt:eu) locale(neomutt:fi) locale(neomutt:fr) locale(neomutt:ga) locale(neomutt:gl) locale(neomutt:hu) locale(neomutt:id) locale(neomutt:it) locale(neomutt:ja) locale(neomutt:ko) locale(neomutt:lt) locale(neomutt:nb_NO) locale(neomutt:nl) locale(neomutt:pl) locale(neomutt:pt_BR) locale(neomutt:ru) locale(neomutt:sk) locale(neomutt:sr) locale(neomutt:sv) locale(neomutt:tr) locale(neomutt:uk) locale(neomutt:zh_CN) locale(neomutt:zh_TW) neomutt-lang neomutt-lang-all"
RDEPENDS:${PN} += "neomutt"

inherit rpm

SUMMARY = "Translations for package neomutt"
DESCRIPTION = "Provides translations for the 'neomutt' package."
LICENSE = "GPL-2.0-or-later"

PV = "20230407"

RPM_NAME = "neomutt-lang-20230407-1.1.noarch.rpm"
RPM_HASH = "b54c427a67612f24691137392208aba742bca10e59d512ef1031228d295e425554c27d53c15295cde51f4dae063e64530842ca00174b40e0e7597f9ca4eabfcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(neomutt:bg) locale(neomutt:ca) locale(neomutt:cs) locale(neomutt:da) locale(neomutt:de) locale(neomutt:el) locale(neomutt:en_GB) locale(neomutt:eo) locale(neomutt:es) locale(neomutt:et) locale(neomutt:eu) locale(neomutt:fi) locale(neomutt:fr) locale(neomutt:ga) locale(neomutt:gl) locale(neomutt:hu) locale(neomutt:id) locale(neomutt:it) locale(neomutt:ja) locale(neomutt:ko) locale(neomutt:lt) locale(neomutt:nb_NO) locale(neomutt:nl) locale(neomutt:pl) locale(neomutt:pt_BR) locale(neomutt:ru) locale(neomutt:sk) locale(neomutt:sr) locale(neomutt:sv) locale(neomutt:tr) locale(neomutt:uk) locale(neomutt:zh_CN) locale(neomutt:zh_TW) neomutt-lang neomutt-lang-all"
RDEPENDS:${PN} += "neomutt"

inherit rpm

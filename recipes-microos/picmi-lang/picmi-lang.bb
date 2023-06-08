SUMMARY = "Translations for package picmi"
DESCRIPTION = "Provides translations for the 'picmi' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "picmi-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "c384a70d123adb499d8db28af453058a59c11f94295b9e34fbb5fb6e2be81c260bcf4024e2d90373da42b6a483c43c8f7a12d94e406d14df8ebb3389f06f04e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(picmi:bs) locale(picmi:ca) locale(picmi:ca@valencia) locale(picmi:cs) locale(picmi:da) locale(picmi:de) locale(picmi:el) locale(picmi:en_GB) locale(picmi:es) locale(picmi:et) locale(picmi:eu) locale(picmi:fi) locale(picmi:fr) locale(picmi:ga) locale(picmi:gl) locale(picmi:hu) locale(picmi:it) locale(picmi:ja) locale(picmi:ka) locale(picmi:kk) locale(picmi:ko) locale(picmi:lt) locale(picmi:lv) locale(picmi:ml) locale(picmi:mr) locale(picmi:nb) locale(picmi:nds) locale(picmi:nl) locale(picmi:nn) locale(picmi:pl) locale(picmi:pt) locale(picmi:pt_BR) locale(picmi:ro) locale(picmi:ru) locale(picmi:sk) locale(picmi:sl) locale(picmi:sr) locale(picmi:sr@ijekavian) locale(picmi:sr@ijekavianlatin) locale(picmi:sr@latin) locale(picmi:sv) locale(picmi:tr) locale(picmi:ug) locale(picmi:uk) locale(picmi:zh_CN) locale(picmi:zh_TW) picmi-lang picmi-lang-all"
RDEPENDS:${PN} += "picmi"

inherit rpm

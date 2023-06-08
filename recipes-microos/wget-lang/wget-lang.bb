SUMMARY = "Translations for package wget"
DESCRIPTION = "Provides translations for the 'wget' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.21.3"

RPM_NAME = "wget-lang-1.21.3-1.9.noarch.rpm"
RPM_HASH = "c7505ef9980ed758c0568f851967e7729a31d9eeef8b143689e45a39512a829fa55be391f908e8fc43193ebe04775eeb6f11fedb2eee4844ca175961f727d4d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wget:af) locale(wget:be) locale(wget:bg) locale(wget:ca) locale(wget:cs) locale(wget:da) locale(wget:de) locale(wget:el) locale(wget:en_GB) locale(wget:eo) locale(wget:es) locale(wget:et) locale(wget:eu) locale(wget:fi) locale(wget:fr) locale(wget:ga) locale(wget:gl) locale(wget:he) locale(wget:hr) locale(wget:hu) locale(wget:id) locale(wget:it) locale(wget:ja) locale(wget:ko) locale(wget:lt) locale(wget:ms) locale(wget:nb) locale(wget:nl) locale(wget:pl) locale(wget:pt) locale(wget:pt_BR) locale(wget:ro) locale(wget:ru) locale(wget:sk) locale(wget:sl) locale(wget:sr) locale(wget:sv) locale(wget:tr) locale(wget:uk) locale(wget:vi) locale(wget:zh_CN) locale(wget:zh_TW) wget-lang wget-lang-all"
RDEPENDS:${PN} += "wget"

inherit rpm

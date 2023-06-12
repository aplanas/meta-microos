SUMMARY = "Translations for package krecorder"
DESCRIPTION = "Provides translations for the 'krecorder' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "krecorder-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "f185766cae45e0214e66794044f04ddf3628553e3df597c444bf42fc0d3c6ca25a00601b83b4270fb24d631f92ca0b00a221d38d829c4c9396a95f088f1fc628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krecorder-lang krecorder-lang-all locale(krecorder:ar) locale(krecorder:ca) locale(krecorder:ca@valencia) locale(krecorder:cs) locale(krecorder:de) locale(krecorder:el) locale(krecorder:en_GB) locale(krecorder:es) locale(krecorder:fi) locale(krecorder:fr) locale(krecorder:it) locale(krecorder:ja) locale(krecorder:ka) locale(krecorder:ko) locale(krecorder:lt) locale(krecorder:nl) locale(krecorder:nn) locale(krecorder:pa) locale(krecorder:pl) locale(krecorder:pt) locale(krecorder:pt_BR) locale(krecorder:ro) locale(krecorder:ru) locale(krecorder:sk) locale(krecorder:sl) locale(krecorder:sv) locale(krecorder:tr) locale(krecorder:uk) locale(krecorder:zh_CN) locale(krecorder:zh_TW)"
RDEPENDS:${PN} += "krecorder"

inherit rpm

SUMMARY = "Translations for package subtitlecomposer"
DESCRIPTION = "Provides translations for the 'subtitlecomposer' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "subtitlecomposer-lang-0.7.1-6.2.noarch.rpm"
RPM_HASH = "77b354bd13c56e2774c4d510a640e019b1c545e33b9f1bd422d1b726aa7ae72168a749137f706c354028276446041a378ee72e452e63f964a5c668ec670aad5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(subtitlecomposer:bg) locale(subtitlecomposer:ca) locale(subtitlecomposer:ca@valencia) locale(subtitlecomposer:cs) locale(subtitlecomposer:de) locale(subtitlecomposer:el) locale(subtitlecomposer:en_GB) locale(subtitlecomposer:es) locale(subtitlecomposer:et) locale(subtitlecomposer:fi) locale(subtitlecomposer:fr) locale(subtitlecomposer:hr) locale(subtitlecomposer:hu) locale(subtitlecomposer:it) locale(subtitlecomposer:nl) locale(subtitlecomposer:pl) locale(subtitlecomposer:pt) locale(subtitlecomposer:pt_BR) locale(subtitlecomposer:ru) locale(subtitlecomposer:sk) locale(subtitlecomposer:sl) locale(subtitlecomposer:sr) locale(subtitlecomposer:sr@latin) locale(subtitlecomposer:sv) locale(subtitlecomposer:uk) locale(subtitlecomposer:zh_TW) subtitlecomposer-lang subtitlecomposer-lang-all"
RDEPENDS:${PN} += "subtitlecomposer"

inherit rpm

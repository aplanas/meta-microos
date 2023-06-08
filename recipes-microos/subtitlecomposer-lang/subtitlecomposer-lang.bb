SUMMARY = "Translations for package subtitlecomposer"
DESCRIPTION = "Provides translations for the 'subtitlecomposer' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "subtitlecomposer-lang-0.7.1-6.1.noarch.rpm"
RPM_HASH = "00bd7e832bf9d81059da0c581da504ab1f77a7a877ef7beab2c4999052879e6796850b5d1ad0f873841879b6799f294460f38b72850649f532b68b7e86b235e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(subtitlecomposer:bg) locale(subtitlecomposer:ca) locale(subtitlecomposer:ca@valencia) locale(subtitlecomposer:cs) locale(subtitlecomposer:de) locale(subtitlecomposer:el) locale(subtitlecomposer:en_GB) locale(subtitlecomposer:es) locale(subtitlecomposer:et) locale(subtitlecomposer:fi) locale(subtitlecomposer:fr) locale(subtitlecomposer:hr) locale(subtitlecomposer:hu) locale(subtitlecomposer:it) locale(subtitlecomposer:nl) locale(subtitlecomposer:pl) locale(subtitlecomposer:pt) locale(subtitlecomposer:pt_BR) locale(subtitlecomposer:ru) locale(subtitlecomposer:sk) locale(subtitlecomposer:sl) locale(subtitlecomposer:sr) locale(subtitlecomposer:sr@latin) locale(subtitlecomposer:sv) locale(subtitlecomposer:uk) locale(subtitlecomposer:zh_TW) subtitlecomposer-lang subtitlecomposer-lang-all"
RDEPENDS:${PN} += "subtitlecomposer"

inherit rpm

SUMMARY = "Translations for package telly-skout"
DESCRIPTION = "Provides translations for the 'telly-skout' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "telly-skout-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "17258023119dc8fc539099645cd38d446f6a4e2982c0b294dbd272d39d63105ed8a53eafae60fc8bafbe5cc6b6975bd733293b18b535e63aee281a64ea9dfdd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(telly-skout:ca) \
locale(telly-skout:ca@valencia) \
locale(telly-skout:cs) \
locale(telly-skout:de) \
locale(telly-skout:en_GB) \
locale(telly-skout:es) \
locale(telly-skout:fi) \
locale(telly-skout:fr) \
locale(telly-skout:it) \
locale(telly-skout:ja) \
locale(telly-skout:ka) \
locale(telly-skout:ko) \
locale(telly-skout:lt) \
locale(telly-skout:nl) \
locale(telly-skout:pl) \
locale(telly-skout:pt) \
locale(telly-skout:ru) \
locale(telly-skout:sk) \
locale(telly-skout:sl) \
locale(telly-skout:sv) \
locale(telly-skout:tr) \
locale(telly-skout:uk) \
locale(telly-skout:zh_CN) \
locale(telly-skout:zh_TW) \
telly-skout-lang \
telly-skout-lang-all"
RDEPENDS:${PN} += "telly-skout"

inherit rpm

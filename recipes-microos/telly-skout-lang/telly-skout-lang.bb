SUMMARY = "Translations for package telly-skout"
DESCRIPTION = "Provides translations for the 'telly-skout' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "telly-skout-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "38a7c5c829a0e2b1b04a148f57238965ad456b29370f85f8543aebf33483dc155c072fb34420336ed6a19210e33b546805d19c640d299c8b05e8eee984c201f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(telly-skout:ca) locale(telly-skout:ca@valencia) locale(telly-skout:cs) locale(telly-skout:de) locale(telly-skout:en_GB) locale(telly-skout:es) locale(telly-skout:fi) locale(telly-skout:fr) locale(telly-skout:it) locale(telly-skout:ja) locale(telly-skout:ka) locale(telly-skout:ko) locale(telly-skout:lt) locale(telly-skout:nl) locale(telly-skout:pl) locale(telly-skout:pt) locale(telly-skout:sk) locale(telly-skout:sl) locale(telly-skout:sv) locale(telly-skout:tr) locale(telly-skout:uk) locale(telly-skout:zh_CN) locale(telly-skout:zh_TW) telly-skout-lang telly-skout-lang-all"
RDEPENDS:${PN} += "telly-skout"

inherit rpm

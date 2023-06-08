SUMMARY = "Translations for package kjournald"
DESCRIPTION = "Provides translations for the 'kjournald' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kjournald-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "22d6968b80b157d6fba4e4e734560ef4babb8b1188376bda6df6fd416c3756a2e5f92cc52888c2c4746fe337c1dfae345cb8e7686b8c7787e070e43adde507ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjournald-lang kjournald-lang-all locale(kjournald:ca) locale(kjournald:ca@valencia) locale(kjournald:cs) locale(kjournald:de) locale(kjournald:en_GB) locale(kjournald:es) locale(kjournald:eu) locale(kjournald:fi) locale(kjournald:fr) locale(kjournald:it) locale(kjournald:ja) locale(kjournald:ka) locale(kjournald:ko) locale(kjournald:lt) locale(kjournald:nl) locale(kjournald:pl) locale(kjournald:pt) locale(kjournald:sk) locale(kjournald:sl) locale(kjournald:sv) locale(kjournald:tr) locale(kjournald:uk) locale(kjournald:zh_CN) locale(kjournald:zh_TW)"
RDEPENDS:${PN} += "kjournald"

inherit rpm

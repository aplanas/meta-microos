SUMMARY = "Translations for package kjournald"
DESCRIPTION = "Provides translations for the 'kjournald' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kjournald-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "3998bd7824875121ae97ddda40f787c648937515e71880bfe446b33155837e3f9d0c588159a4a38acbb0aa7d1b4401692003e6dfe504ea0ca3ee5bc80643f9cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjournald-lang kjournald-lang-all locale(kjournald:ca) locale(kjournald:ca@valencia) locale(kjournald:cs) locale(kjournald:de) locale(kjournald:en_GB) locale(kjournald:es) locale(kjournald:eu) locale(kjournald:fi) locale(kjournald:fr) locale(kjournald:it) locale(kjournald:ja) locale(kjournald:ka) locale(kjournald:ko) locale(kjournald:lt) locale(kjournald:nl) locale(kjournald:pl) locale(kjournald:pt) locale(kjournald:ru) locale(kjournald:sk) locale(kjournald:sl) locale(kjournald:sv) locale(kjournald:tr) locale(kjournald:uk) locale(kjournald:zh_CN) locale(kjournald:zh_TW)"
RDEPENDS:${PN} += "kjournald"

inherit rpm

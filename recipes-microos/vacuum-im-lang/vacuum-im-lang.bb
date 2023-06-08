SUMMARY = "Translations for package vacuum-im"
DESCRIPTION = "Provides translations for the 'vacuum-im' package."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "vacuum-im-lang-1.3.0+git1571036065.9f3952b2-1.20.noarch.rpm"
RPM_HASH = "c5f1c3bf538369d9304d3036cc5d84225614fa57f82e10dff1dab39aca28c02b184ca7ab51c19f8aa043cd875061ac0d0bacffefb611b3877d68952d0cb832f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vacuum-im-lang vacuum-im-lang-all"
RDEPENDS:${PN} += "vacuum-im"

inherit rpm

SUMMARY = "Translations for package poxml"
DESCRIPTION = "Provides translations for the 'poxml' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.0"

RPM_NAME = "poxml-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "757cde27c33c48e9d6c067c0c3fde242455eb79f403688a7cdf61f43ca96fdb2d05ad142909ac9b343ddb19f8c6d826b6b2603aa37d343a3114c6b7371b5d3e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "poxml-lang poxml-lang-all"
RDEPENDS:${PN} += "poxml"

inherit rpm

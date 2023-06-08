SUMMARY = "Translations for package texamator"
DESCRIPTION = "Provides translations for the 'texamator' package."
LICENSE = "GPL-3.0-only"

PV = "3.0+git.20190226.91432e4"

RPM_NAME = "texamator-lang-3.0+git.20190226.91432e4-1.19.noarch.rpm"
RPM_HASH = "d46d5bd0fce05be2e33b7cbe514466dcc352e91e0c4cf9fbc9aef6659226e263c83d3bf11d55a0ac48a5ba70e3a043caed6267894c0419cbdf0b0289070d014e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texamator-lang texamator-lang-all"
RDEPENDS:${PN} += "texamator"

inherit rpm

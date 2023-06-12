SUMMARY = "Translations for package musique"
DESCRIPTION = "Provides translations for the 'musique' package."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "1.10.1"

RPM_NAME = "musique-lang-1.10.1-1.17.noarch.rpm"
RPM_HASH = "b41c8b8d4170821fc64a9ab54c5b933ab6202ac0fb60b5e465070056386fbc213e4a3108c08fcd842766a14c94b4c5d7f61b8d3125acf36de039148033ff1839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "musique-lang \
musique-lang-all"
RDEPENDS:${PN} += "musique"

inherit rpm

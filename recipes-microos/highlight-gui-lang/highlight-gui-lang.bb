SUMMARY = "Translations for package highlight-gui"
DESCRIPTION = "Provides translations for the 'highlight-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.5"

RPM_NAME = "highlight-gui-lang-4.5-1.3.noarch.rpm"
RPM_HASH = "683c169849477e103e838cb5e2d25f1be62b112c00669967cf9223873210b16d287f4de21eab07f1375baf9061c308f44d4d73eb841e174c40fe898a7b68b5e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-gui-lang highlight-gui-lang-all"
RDEPENDS:${PN} += "highlight-gui"

inherit rpm

SUMMARY = "Translations for package liblinphone"
DESCRIPTION = "Provides translations for the 'liblinphone' package."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.10"

RPM_NAME = "liblinphone-lang-5.2.10-2.3.noarch.rpm"
RPM_HASH = "2b9819d52d16f8f157ece2712ed31d5b5178487ab64085105a2cb380c826d0d7abd9214d33fb52ae2ed9a164387ee030f1e0327dd32ee9d048a6c2d2a9217644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblinphone-lang liblinphone-lang-all"
RDEPENDS:${PN} += "liblinphone"

inherit rpm

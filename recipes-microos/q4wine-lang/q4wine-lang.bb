SUMMARY = "Translations for package q4wine"
DESCRIPTION = "Provides translations for the 'q4wine' package."
LICENSE = "GPL-3.0-only"

PV = "1.3.13"

RPM_NAME = "q4wine-lang-1.3.13-1.17.noarch.rpm"
RPM_HASH = "68a8cf89ee35775492707c1067ce3d574cc088fcd7966e822fdf4dd6e2a67df752948d49d01acc27313b7b5002064ab413e9254a9ca1f03f02a494e1e29fead7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "q4wine-lang \
q4wine-lang-all"
RDEPENDS:${PN} += "q4wine"

inherit rpm

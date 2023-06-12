SUMMARY = "Zulu localization files for LibreOffice"
DESCRIPTION = "Provides Zulu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-zu-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "b22c8d28fc68fa1ece32d70cfed4d0ce1e1a9ff352ffd4e3255968aab840f65b9f38955e17518c4df850517076744e73525d992eafe918e99d6084ea2aa16b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zu libreoffice-l10n-zu locale(libreoffice:zu)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-zu_ZA"

inherit rpm

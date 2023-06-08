SUMMARY = "Lao localization files for LibreOffice"
DESCRIPTION = "Provides Lao translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-lo-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "66a0ec8a576312e9a6f4226096349acf56cdd7978374018b70f831f9f0f8a1d7159d3a9482b9c4ee3f810365c07c1d6753479c592183c8d3ea5d618de26c1160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lo libreoffice-l10n-lo locale(libreoffice:lo)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-lo_LA"

inherit rpm

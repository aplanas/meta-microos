SUMMARY = "Finnish localization files for LibreOffice"
DESCRIPTION = "Provides Finnish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-fi-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "ee1524f8a4bc21645a656f4d16fd0e520afdfd855ef9089e020fe75c3142355ce0f24ae63f36ef0c1f5853e03a939823fe3e44e74edfe5057e246b5d5c8802a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fi libreoffice-l10n-fi locale(libreoffice:fi)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker libreoffice-voikko"

inherit rpm

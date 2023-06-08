SUMMARY = "Italian localization files for LibreOffice"
DESCRIPTION = "Provides Italian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-it-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "fc847b9759ae429e86fc9f748507aa7336b2b816aa8851a43e13afd660492d7f549ff7c782d5149808d61a230bba1f7d688f971087ea1799b73503d14e45df0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-it libreoffice-l10n-it locale(libreoffice:it)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-it_IT"

inherit rpm

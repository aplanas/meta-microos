SUMMARY = "Breton localization files for LibreOffice"
DESCRIPTION = "Provides Breton translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-br-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "01b03644fe3744da156351df33dbf0cf8bbb7381cb43aa45d24eb84f82eb541dfa5b9edd6708516a706d4f9dd90866bd845dbbeeee9ff4a913af4e448d328ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-br libreoffice-l10n-br locale(libreoffice:br)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-br_FR"

inherit rpm

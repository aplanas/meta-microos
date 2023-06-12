SUMMARY = "Sinhalese localization files for LibreOffice"
DESCRIPTION = "Provides Sinhalese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-si-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "74b9847be6e96744776f83411344cd4bce74e3f90e6c3c28bd88c3b547b67f7b7462c9cc27e85f0bb50c12dcedc23cbacff65f99b3c08403a65f7592f50d31f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-si libreoffice-l10n-si locale(libreoffice:si)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-si_LK"

inherit rpm

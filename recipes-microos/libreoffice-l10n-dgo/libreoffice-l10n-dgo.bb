SUMMARY = "Dogri localization files for LibreOffice"
DESCRIPTION = "Provides Dogri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-dgo-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "bf1afc4366593c3f6e7f17dcab7902fcf281183265ec3e97e67f367221c34f4f30826083a2e7568164ab60194b50601aeec6391dee86b209a909cc1c5af75261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dgo libreoffice-l10n-dgo locale(libreoffice:dgo)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

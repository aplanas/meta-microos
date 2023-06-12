SUMMARY = "Marathi localization files for LibreOffice"
DESCRIPTION = "Provides Marathi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-mr-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "e1ff7ce9ac5fe17ef2c85b260da554e6f22b786a8869cdce667308d8d66335d2cc644d7c8a19b58d2cce7518cc4bb8eb688e6c0b517670b120d1e187285667a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mr \
libreoffice-l10n-mr \
locale(libreoffice:mr)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Kabyle localization files for LibreOffice"
DESCRIPTION = "Provides Kabyle translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-kab-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "2f97a3c0d968fb2a491e35c31390aa3c17809ce556ace8518a319d9b504737761f5862593997f68560655856b3e74b0d2aa4cd9964cc5cd0b4a69b1cb132604a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kab libreoffice-l10n-kab locale(libreoffice:kab)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

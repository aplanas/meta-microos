SUMMARY = "Spanish localization files for LibreOffice"
DESCRIPTION = "Provides Spanish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-es-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "00b8c031c50ce9fb03a6d1ef284b2ec564325de6bf911b5850067605c1e36ea2d5bf99f3ed1372b1f82658fe9a0e6285a3575d9660dbf2deda50f65a7633e90b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-es libreoffice-l10n-es locale(libreoffice:es)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-es"

inherit rpm

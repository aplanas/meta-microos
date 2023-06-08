SUMMARY = "Slovak localization files for LibreOffice"
DESCRIPTION = "Provides Slovak translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-sk-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "3c39d57369898ae3f6240dfe0c1df04119e0c2cace029fe0fcfe32416142276fc9290af260235b64677f0f1ee9e6b94325e2c5244250e5f12c9a5213627870f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sk libreoffice-l10n-sk locale(libreoffice:sk)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-sk_SK"

inherit rpm

SUMMARY = "Kazakh localization files for LibreOffice"
DESCRIPTION = "Provides Kazakh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-kk-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "9134076ccadd5e7b4d9d1e8f2de386a0b94d588c82362f45d92b755c177ea121f07ad81cc25d3274aea2ae59545c5757b6d50b1827c9240ce5f9190b8edce6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kk libreoffice-l10n-kk locale(libreoffice:kk)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

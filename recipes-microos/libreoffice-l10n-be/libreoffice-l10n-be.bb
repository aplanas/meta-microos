SUMMARY = "Belarusian localization files for LibreOffice"
DESCRIPTION = "Provides Belarusian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-be-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "e01d11aedba79542c8871e7ca290eceae31d6ef0babf7a7bed6157a632491a0b9d6d8cc3b4ebe8cd0b2c78b840229fd3ab557c6ba2fa594e892c94c14233018c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-be libreoffice-l10n-be locale(libreoffice:be)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-be_BY"

inherit rpm

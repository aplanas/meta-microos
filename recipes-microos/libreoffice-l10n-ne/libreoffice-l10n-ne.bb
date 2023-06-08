SUMMARY = "Nepali localization files for LibreOffice"
DESCRIPTION = "Provides Nepali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ne-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "5048599ec03239e936ee844a6f22f7f588836f6252bcdca7554139deda918d4cb9f718285ae7a237b17abacca88895a8cb60439351871478c1601adaa33acc21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ne libreoffice-l10n-ne locale(libreoffice:ne)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-ne_NP"

inherit rpm

SUMMARY = "Bengali_India localization files for LibreOffice"
DESCRIPTION = "Provides Bengali_India translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-bn_IN-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "95a87bdef25e75a6941c608c2a7b68ac70bfdd56b5bd64aad8a282c92caeb43098b2afaf844e7a73cd13b83491342ec1852b85467f0506344981794d83df33fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn-IN libreoffice-help-bn_IN libreoffice-l10n-bn-IN libreoffice-l10n-bn_IN locale(libreoffice:bn_IN)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-bn_IN"

inherit rpm

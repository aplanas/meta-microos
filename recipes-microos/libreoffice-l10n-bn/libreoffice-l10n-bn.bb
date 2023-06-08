SUMMARY = "Bengali localization files for LibreOffice"
DESCRIPTION = "Provides Bengali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-bn-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "e94232498c17e6a50a4ac00c7f201af673598f1e2cf80709fd2a0e67f48c57d0260a99bf32bcd9af22870b7f5dfc53bb33d53700bc03bddf86dd8e95945e39f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn libreoffice-l10n-bn locale(libreoffice:bn)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-bn_BD"

inherit rpm

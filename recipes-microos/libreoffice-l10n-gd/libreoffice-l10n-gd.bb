SUMMARY = "Gaelic localization files for LibreOffice"
DESCRIPTION = "Provides Gaelic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-gd-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "5717917e68a9acd521461e73fc53f2584242509dd8722926f77da078de895ad730cc3d2456cfa39ca1a3b3c2c7669f8cc041aeaea4b610e552bc6da56057ef6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gd libreoffice-l10n-gd locale(libreoffice:gd)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-gd_GB"

inherit rpm

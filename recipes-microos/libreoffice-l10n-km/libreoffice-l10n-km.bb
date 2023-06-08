SUMMARY = "Khmer localization files for LibreOffice"
DESCRIPTION = "Provides Khmer translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-km-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "b481e2feeb63cc634cc2898c8f86fa64af09cda9973d84a24176dce8a91974a3d812228d90d859d099f3bff11ae4347bbba7af1a75317216c2e6e087a27eef60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-km libreoffice-l10n-km locale(libreoffice:km)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

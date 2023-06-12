SUMMARY = "Dzongkha localization files for LibreOffice"
DESCRIPTION = "Provides Dzongkha translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-dz-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "0dc4db9b47e5de1372df06878edda8eae65a69e2cdc1090d463ff46d917bfa79096cddb3fd54fb4ae9213a10b58ae76270daf2dfaf79a87b5902e2b2ab214d35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dz \
libreoffice-l10n-dz \
locale(libreoffice:dz)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

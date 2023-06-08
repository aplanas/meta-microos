SUMMARY = "Friulian localization files for LibreOffice"
DESCRIPTION = "Provides Friulian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-fur-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "75d986fd23a94de893ce48fb3afb3f3d9026f876b7fc573c38cf5eca6c433e52cd6375a4f1146a828163ebb529bdedea7f0b8b137a657b9f4d1c6bd7fefc8342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fur libreoffice-l10n-fur locale(libreoffice:fur)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

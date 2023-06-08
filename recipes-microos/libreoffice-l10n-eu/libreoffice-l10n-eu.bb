SUMMARY = "Basque localization files for LibreOffice"
DESCRIPTION = "Provides Basque translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-eu-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "e3f028b87b321a9fcd6a33d16460e18368d27ddd09c74cd59211c3fd04190c1de2d3da98a3ccd5b72c6cc920b3cb18e27d6425adf389f3b80f158be73405a516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eu libreoffice-l10n-eu locale(libreoffice:eu)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

SUMMARY = "Xhosa localization files for LibreOffice"
DESCRIPTION = "Provides Xhosa translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-xh-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "ae655e78f64ceee19f9aa12de572599810d6ee716c07c70664ac4b5dbcbcdec2c49366534e9b16f3c652aa9ad3328e0792707608782f7011a665782f5f7b03b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-xh libreoffice-l10n-xh locale(libreoffice:xh)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

SUMMARY = "Catalan localization files for LibreOffice"
DESCRIPTION = "Provides Catalan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ca-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "4fd83f7f7db8053b274da6db64dbc05f37fd1c7372212da1c19e6fb61483cf368683bcb8fa532cf15e1edfd771a4bf1eac0ed8fe32c0eab9cdb8f256453d3dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca libreoffice-l10n-ca locale(libreoffice:ca)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-ca"

inherit rpm

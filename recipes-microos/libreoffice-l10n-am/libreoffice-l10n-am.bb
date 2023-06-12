SUMMARY = "Amharic localization files for LibreOffice"
DESCRIPTION = "Provides Amharic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-am-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "5ec1ca9f39f282bed29e841ea4a79dc36e12e0fdc0cb93c6a9621eb99375789cd94b22ce926574842c26c587c21b1f283544a63a5710753dff190d005df4f255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-am libreoffice-l10n-am locale(libreoffice:am)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

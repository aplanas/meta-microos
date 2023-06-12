SUMMARY = "English localization files for LibreOffice"
DESCRIPTION = "Provides English translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-en-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "83333cc3b1fb6e6073a928e1b7218f4f254ff9ac4d8cb74381c68f94ea09593460e7603c506be3c5491860b9819d1d4e5f438d2a8b080f52b1965f8763ed77f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en \
libreoffice-help-en-US \
libreoffice-l10n-en \
locale(libreoffice:en)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en"

inherit rpm

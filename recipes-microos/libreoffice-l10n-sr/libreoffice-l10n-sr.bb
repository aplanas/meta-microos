SUMMARY = "Serbian localization files for LibreOffice"
DESCRIPTION = "Provides Serbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-sr-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "94d9f3bf9866947b313612bcaf35fd01956c0f49c365b7020c4f5d7f4db8c7c46d7ec792684b97a2d32883a0ef3878c10b47d72375d907fa0586f787cbbbb1b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sr \
libreoffice-l10n-sr \
locale(libreoffice:sr)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sr"

inherit rpm

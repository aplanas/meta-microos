SUMMARY = "French localization files for LibreOffice"
DESCRIPTION = "Provides French translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-fr-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "f1fd8bfd80cd912fbb65b9d255800465b67084cd8c55d6c46e68e7e9f736ab6ef770a2b0a15cb0f8ce894735c5e269cf9fd15b07c0e2e51c703440f04f5f6c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fr \
libreoffice-l10n-fr \
locale(libreoffice:fr)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-fr_FR"

inherit rpm

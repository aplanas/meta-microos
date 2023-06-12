SUMMARY = "Turkish localization files for LibreOffice"
DESCRIPTION = "Provides Turkish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-tr-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "50d0abccd4415d99adfb4d4b625790ff7fd71452e8cb8a267bb60678b8509d67c919c81b8230fd63eb469daa5d1a61b07331cc83af3721e72bf0285f712b0b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tr libreoffice-l10n-tr locale(libreoffice:tr)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-tr_TR"

inherit rpm

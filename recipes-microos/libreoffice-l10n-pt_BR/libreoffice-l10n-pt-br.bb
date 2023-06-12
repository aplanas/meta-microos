SUMMARY = "Brazilian_Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Brazilian_Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-pt_BR-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "357cc4be4105de6a54b43328eb03448a292af96a852ea679eca4094cda85e21d274a6b1fa795a3ad2f17f776634c9c6ae090415077f03f27144ae510af6c1067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt-BR \
libreoffice-help-pt_BR \
libreoffice-l10n-pt-BR \
libreoffice-l10n-pt_BR \
locale(libreoffice:pt_BR)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt_BR"

inherit rpm

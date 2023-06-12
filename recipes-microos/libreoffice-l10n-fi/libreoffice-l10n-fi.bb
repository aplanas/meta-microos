SUMMARY = "Finnish localization files for LibreOffice"
DESCRIPTION = "Provides Finnish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-fi-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "c4b586491bc54ff36e461b59544148c35b761398d251a50f6ab1d6c52ffe2b9c721af5695c8da9cbff18998a98eda93c16374dc8bcdef7093bcdf41f69847cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fi \
libreoffice-l10n-fi \
locale(libreoffice:fi)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
libreoffice-voikko"

inherit rpm

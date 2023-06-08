SUMMARY = "Traditional_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Traditional_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-zh_TW-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "8d20fd7153c974a6c0f014011f0291b626b803f46434966f037dc8a28df2a64f24e4ad084749283d4e8813b4d3d9b4facd81c69ecbebdbf8258cd077ebbea9ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-Hant libreoffice-help-zh-TW libreoffice-help-zh_TW libreoffice-l10n-zh-Hant libreoffice-l10n-zh-TW libreoffice-l10n-zh_TW locale(libreoffice:zh_TW)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

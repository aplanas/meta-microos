SUMMARY = "English_ZA localization files for LibreOffice"
DESCRIPTION = "Provides English_ZA translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-en_ZA-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "0906490d6b70641c177debdcd7ad9563d00092d54f08d572e476af41787bd6b2c5564fbba35aab09e714586d848a965d60756e561b0caccd20f975f82ca713a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-ZA libreoffice-help-en_ZA libreoffice-l10n-en_ZA locale(libreoffice:en_ZA)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-en_ZA"

inherit rpm

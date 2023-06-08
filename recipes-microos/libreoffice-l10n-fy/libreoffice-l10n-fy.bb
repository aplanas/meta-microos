SUMMARY = "Frisian localization files for LibreOffice"
DESCRIPTION = "Provides Frisian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-fy-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "b51af278822014b18f3b92a83a8eb397057f61baf0a125096db066924f82b35c1383f3813c2b9afefffe3349b5f79d5f3b92b4e90043d9b8e26bf171a109a332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fy libreoffice-l10n-fy locale(libreoffice:fy)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

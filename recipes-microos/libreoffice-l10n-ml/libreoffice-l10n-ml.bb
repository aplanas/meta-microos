SUMMARY = "Malayalam localization files for LibreOffice"
DESCRIPTION = "Provides Malayalam translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ml-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "e0456f8de28a603e04100a282cead8cc441cc1295468a46701ba2dbb67844aff771207a04ce78e92c8cfe099876905379095a3768de1aeca0668564f3221acc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ml libreoffice-l10n-ml locale(libreoffice:ml)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

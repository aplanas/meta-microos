SUMMARY = "Irish localization files for LibreOffice"
DESCRIPTION = "Provides Irish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ga-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "103dc89b6f5002bc45743dddbb0489366ddafce71132542d838740975874c0336f232e9fda3de13f40731116ec975a2607c41e1bb9318f3accecb017d021687f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ga libreoffice-l10n-ga locale(libreoffice:ga)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

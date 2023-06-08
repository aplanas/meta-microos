SUMMARY = "Northern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Northern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-nso-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "f872c5460a98bf901597e5c6aadadd28d82433f75c385fb293fa9c5503d34fdf54c121919ec4bd8f7acd136720724237d41fdb9ba4675c32f10e372943bd5d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nso libreoffice-l10n-nso locale(libreoffice:nso)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

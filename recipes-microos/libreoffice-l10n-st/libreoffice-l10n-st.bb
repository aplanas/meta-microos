SUMMARY = "Southern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-st-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "04afd13469add3b7a314ea64282e4873c7f3b99529f75d90eefafb18d75ca91b8222171c79417da8191ecc9e6e5a49485df8259a4186eba5ef8dfa43ea31e3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-st libreoffice-l10n-st locale(libreoffice:st)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

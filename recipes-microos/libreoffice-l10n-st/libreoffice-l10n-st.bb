SUMMARY = "Southern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-st-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "0cc78015a9e48c43969bfb8904b8fd0dc3ff291031eef9e1df6655ed1ecf73ab451d0b63cd2ed0fe15326163fdf49f13f49b661717f47a2dcd70e3a25a65bf1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-st \
libreoffice-l10n-st \
locale(libreoffice:st)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

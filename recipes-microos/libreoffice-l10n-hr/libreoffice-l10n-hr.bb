SUMMARY = "Croatian localization files for LibreOffice"
DESCRIPTION = "Provides Croatian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-hr-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "16b31a871baea2c19f13eef5887be5973ce61ee9bc6a657725f261f3f20f1ab15750eba99d95cae66eadc38da834d80089d3cbc51ef350389a171c9e0d68b9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hr libreoffice-l10n-hr locale(libreoffice:hr)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-hr_HR"

inherit rpm

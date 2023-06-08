SUMMARY = "Monglolian localization files for LibreOffice"
DESCRIPTION = "Provides Monglolian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-mn-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "4425eaf6fb758dfe7151dd1568f3204b04d80405caf8ccb9db24e4055af4c49f56118260ee241c337ca58835a9a7a9772c59cefe83afc9e8f86611ad0dbfc6ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mn libreoffice-l10n-mn locale(libreoffice:mn)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

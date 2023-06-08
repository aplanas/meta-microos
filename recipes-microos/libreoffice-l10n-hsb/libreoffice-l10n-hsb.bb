SUMMARY = "Upper_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Upper_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-hsb-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "23e96159819e1390e82f4b0dff892cb93386fada6e9d2010e1049602bd29c1b1ebf134edaac2686f30400a53691ffbe66aa34726956d97a958a4a360ea9d9e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hsb libreoffice-l10n-hsb locale(libreoffice:hsb)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

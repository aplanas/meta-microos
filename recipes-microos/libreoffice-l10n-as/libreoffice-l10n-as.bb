SUMMARY = "Assamese localization files for LibreOffice"
DESCRIPTION = "Provides Assamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-as-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "b89dc5eb9893864bde0d7bb0047f294e04bc222432cc518cf4925a2c4a57460f36235eb95f8816ada09eadceaa3a0b842a66475adf604cbaa6825e4ad9f01827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-as libreoffice-l10n-as locale(libreoffice:as)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

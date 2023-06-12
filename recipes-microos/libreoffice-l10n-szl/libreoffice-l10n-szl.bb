SUMMARY = "Silesian localization files for LibreOffice"
DESCRIPTION = "Provides Silesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-szl-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "e2d3be9a0f6df707f31cf626ac9818ec5fea9973995f4a8cb432556f919f3ea5377df1efb2ec826c9785e8c91beade48ad186f661b7a3928ce2848af508cd4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-szl libreoffice-l10n-szl locale(libreoffice:szl)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

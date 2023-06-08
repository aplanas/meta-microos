SUMMARY = "Esperanto localization files for LibreOffice"
DESCRIPTION = "Provides Esperanto translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-eo-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "398c7697461582e543dd558a58a528ca0eb13bdd851becf23574e99c46ae0405cc988925d34992386a5a8c9b77bf743c431df2e77359305ad122662dc3d607d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eo libreoffice-l10n-eo locale(libreoffice:eo)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

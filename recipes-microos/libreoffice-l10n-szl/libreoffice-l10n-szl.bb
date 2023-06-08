SUMMARY = "Silesian localization files for LibreOffice"
DESCRIPTION = "Provides Silesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-szl-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "c0c5c615503aa151bb3a05b0257acc21a3f8b9e2f90b53cc417d392804393e1236264911f522399c8d5fafc92f205c39ead5b5f8c7403064642fa1e4a99269c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-szl libreoffice-l10n-szl locale(libreoffice:szl)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

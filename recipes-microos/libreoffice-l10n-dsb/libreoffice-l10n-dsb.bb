SUMMARY = "Lower_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Lower_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-dsb-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "4b90ea06f13efd1907c539f3b656577fa59954c153197bbb163d888773379c58e3d7b8a459927071a31b37fdf76744594e300ab48c48bafcbbb3b9c0bf59ba73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dsb libreoffice-l10n-dsb locale(libreoffice:dsb)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

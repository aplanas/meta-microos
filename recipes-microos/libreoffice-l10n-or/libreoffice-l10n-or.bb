SUMMARY = "Odia localization files for LibreOffice"
DESCRIPTION = "Provides Odia translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-or-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "d3d8de4f518fadb64c274d1bd98ce283ce947c796624892832c704dc0fd0fd00fc748b562a6f41b6a2396a6d62658ef2bb38e2613fa822336619704cac28aede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-or libreoffice-l10n-or locale(libreoffice:or)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

SUMMARY = "Burnese localization files for LibreOffice"
DESCRIPTION = "Provides Burnese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-my-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "a6beece65e47128533f93da298aad0150613ea46957701e99f4a76f71ede4b39aa6b96fc333efafb07432ca4988da24c1883092917dc2ef9e008baf60b823bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-my libreoffice-l10n-my locale(libreoffice:my)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

SUMMARY = "Sindhi localization files for LibreOffice"
DESCRIPTION = "Provides Sindhi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-sd-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "3a46019f564e3a476e6c56cb520ac60a77930c5c4a0db15ad6c7f9ea1850cc44a213de50035ab7548c986409b9a9b82508753b624c046dae1d0a40b0c5b64e02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sd libreoffice-l10n-sd locale(libreoffice:sd)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

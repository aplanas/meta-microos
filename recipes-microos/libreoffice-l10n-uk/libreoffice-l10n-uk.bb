SUMMARY = "Ukrainian localization files for LibreOffice"
DESCRIPTION = "Provides Ukrainian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-uk-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "d40a516ca3ad67a895d67960dace265b8bace93720400a2f33ce786a65e5acbe7e2f0b513b26a57563380b03e1c87b8a59b83d8e6247a4593a6f60eb0968f72e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uk libreoffice-l10n-uk locale(libreoffice:uk)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-uk_UA"

inherit rpm

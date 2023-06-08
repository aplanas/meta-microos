SUMMARY = "Lithuanian localization files for LibreOffice"
DESCRIPTION = "Provides Lithuanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-lt-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "dcfc1ddaf0344896cbd111244ff8d5a4f1a67b70039609bf507d6df2d8d62150ca510d8dc575d47af2850dd836050a351043c316e6a03bf4200c8c0ea9f7cff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lt libreoffice-l10n-lt locale(libreoffice:lt)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-lt_LT"

inherit rpm

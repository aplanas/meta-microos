SUMMARY = "Maithili localization files for LibreOffice"
DESCRIPTION = "Provides Maithili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-mai-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "373e5880f3dc7f0c6bfbc84a3b6a7090170fe15f5d52ad017ce3bdc399d706b1403ef80b2cbccfa3f28fefdf04b0f41c2283219b6de4a95d88ed2fa6a9a65e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mai libreoffice-l10n-mai locale(libreoffice:mai)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

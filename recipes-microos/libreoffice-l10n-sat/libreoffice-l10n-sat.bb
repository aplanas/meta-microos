SUMMARY = "Santali localization files for LibreOffice"
DESCRIPTION = "Provides Santali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-sat-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "293130bccb8f4af68e952c4f8e0e7804930d4169c099df5ba8ed7466f99d5127f955c9e55c5f73b2284fc27158c2ff5df07fc3bac9ddc11dd29f896a59f47f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sat libreoffice-l10n-sat locale(libreoffice:sat)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

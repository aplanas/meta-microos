SUMMARY = "Welsh localization files for LibreOffice"
DESCRIPTION = "Provides Welsh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-cy-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "96b9c6868ad3f4333f2419647ce1b422783a3ea3447c715410ce71ed2c93a5581c4c4668fb857110359fa8adee219cc8790425ba912c128605e56a616eec20c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cy libreoffice-l10n-cy locale(libreoffice:cy)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

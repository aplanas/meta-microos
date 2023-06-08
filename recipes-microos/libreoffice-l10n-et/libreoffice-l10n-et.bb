SUMMARY = "Estonian localization files for LibreOffice"
DESCRIPTION = "Provides Estonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-et-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "1378176e0452d6e1c982c2908a3a5926a49d2e9daae492657338e2c2695732d3062327b64ada6ea575da63479b58eae0c0b8f499a7afc68989c36d1c725bcc8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-et libreoffice-l10n-et locale(libreoffice:et)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-et_EE"

inherit rpm

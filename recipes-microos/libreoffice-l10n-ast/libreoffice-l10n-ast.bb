SUMMARY = "Asturian localization files for LibreOffice"
DESCRIPTION = "Provides Asturian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ast-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "31607dd1e5c416457e55f4e2c9b66b48d01e2706de8d9d5b36e73e532cd9b7c05f53aa4d32e19ae903ffa36754035a27fc18aef9035b35462a2f045b0b8701cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ast libreoffice-l10n-ast locale(libreoffice:ast)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

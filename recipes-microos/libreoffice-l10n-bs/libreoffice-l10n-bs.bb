SUMMARY = "Bosnian localization files for LibreOffice"
DESCRIPTION = "Provides Bosnian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-bs-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "818b7b17a8de6d5169e951a4a94941a62a17ae8fd6e6d02ba2604da37f014e62d279db57b3d29bc4ef47c430df74f4fff6fe2d314881ce980aceb162602256cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bs libreoffice-l10n-bs locale(libreoffice:bs)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

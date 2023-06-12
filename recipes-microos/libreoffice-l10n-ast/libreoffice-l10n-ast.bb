SUMMARY = "Asturian localization files for LibreOffice"
DESCRIPTION = "Provides Asturian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ast-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "524daf4475ae51c59f1cdd04953bc35bf5d4e2c630f1e7bc5d842a5a03337b55afde1ba23e971c540180dd94f337cdb17f106d9764d44e473b68f3be221a449b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ast libreoffice-l10n-ast locale(libreoffice:ast)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

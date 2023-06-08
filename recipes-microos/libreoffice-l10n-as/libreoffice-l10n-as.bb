SUMMARY = "Assamese localization files for LibreOffice"
DESCRIPTION = "Provides Assamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-as-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "7cfddbae023e46187a720b8ecca351d7b1a0898b5f5a41a70c9345177ae01cc40834091ad9397bfc79e63859782df8ba9a0b2d6bae435a11ddef3eb86439973c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-as libreoffice-l10n-as locale(libreoffice:as)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

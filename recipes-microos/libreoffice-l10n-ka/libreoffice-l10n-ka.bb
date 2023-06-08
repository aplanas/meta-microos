SUMMARY = "Georgian localization files for LibreOffice"
DESCRIPTION = "Provides Georgian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ka-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "979de303c9e487d9ce8b0cb3d17d7dc567619d9ff2715606a3b35823f81dcf00a6ddec2e98be631dc09f91b4882758f2a51f2f818e227b10f837e05854dfa426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ka libreoffice-l10n-ka locale(libreoffice:ka)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

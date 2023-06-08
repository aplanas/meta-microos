SUMMARY = "Tibetian localization files for LibreOffice"
DESCRIPTION = "Provides Tibetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-bo-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "30bfa51b697a1fe5fb54b49aefb66616bd53650585e0a6e46aa451d5fa83e5e7fddd57ab646f17ea2d584d21e14283df0e3c52c8bf5fba0824984a81a5f23439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bo libreoffice-l10n-bo locale(libreoffice:bo)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-bo"

inherit rpm

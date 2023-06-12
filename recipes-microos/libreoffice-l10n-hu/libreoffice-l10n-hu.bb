SUMMARY = "Hungarian localization files for LibreOffice"
DESCRIPTION = "Provides Hungarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-hu-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "156bab533f271cd4a33ce46b03f4961ea1869b9874a967555330ddeb1f802cde50057aa7917564ca9c76b4d6c98146d6c875beb763c6a0b89f9824a2b673862d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hu libreoffice-l10n-hu locale(libreoffice:hu)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-hu_HU"

inherit rpm

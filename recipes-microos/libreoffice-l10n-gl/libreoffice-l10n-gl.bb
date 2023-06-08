SUMMARY = "Galician localization files for LibreOffice"
DESCRIPTION = "Provides Galician translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-gl-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "1bed110e994ce91669f7736fd71a5929eeb3f5e82c7c1239e35629e17b6749f582bdf97d129b76012db4e0b3cb875dcc75e3eaef3b91306652ebc3185c4073d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gl libreoffice-l10n-gl locale(libreoffice:gl)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-gl"

inherit rpm

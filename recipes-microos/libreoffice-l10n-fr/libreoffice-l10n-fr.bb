SUMMARY = "French localization files for LibreOffice"
DESCRIPTION = "Provides French translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-fr-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "5a54e36166174de0f444b3456ef33b2d9635c9754bf7cf628cc95e7541418960ff26ed646c2bd332dec3435b00f6a3f5453be007fe31c65b84a4be5f54950c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fr libreoffice-l10n-fr locale(libreoffice:fr)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-fr_FR"

inherit rpm

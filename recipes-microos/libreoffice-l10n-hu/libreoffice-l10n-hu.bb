SUMMARY = "Hungarian localization files for LibreOffice"
DESCRIPTION = "Provides Hungarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-hu-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "f216d7dc86edd9da8b95d31fa366e361d7dcc9da8f92d816fe8a6aa3e1cd034e84063410c1b3f4ce1eb7f450210d3bc7af01bdbee1d62911d190027ed22244db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hu libreoffice-l10n-hu locale(libreoffice:hu)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-hu_HU"

inherit rpm

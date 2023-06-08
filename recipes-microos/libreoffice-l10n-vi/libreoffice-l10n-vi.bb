SUMMARY = "Vietnamese localization files for LibreOffice"
DESCRIPTION = "Provides Vietnamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-vi-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "7fc15311b1ef2b521e3e9c69025c96eaa7ffcd3e3b07dcd7cbc414dc8982bb3d0742443bd190753ce530428c2184d9ce7d157898f4b2d617c3ac5fe568cd38b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vi libreoffice-l10n-vi locale(libreoffice:vi)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-vi"

inherit rpm

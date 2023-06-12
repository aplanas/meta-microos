SUMMARY = "Bokmal localization files for LibreOffice"
DESCRIPTION = "Provides Bokmal translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-nb-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "e2707247c21f83c2dc8d2d620d70cd6dbfcc01c4a0f061dd950a1c08a27469c47b4dc913ee7945c37933da0b717e8c1cf6118a3f1db63cade728a861c1e7acf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nb libreoffice-l10n-nb locale(libreoffice:nb)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-no"

inherit rpm

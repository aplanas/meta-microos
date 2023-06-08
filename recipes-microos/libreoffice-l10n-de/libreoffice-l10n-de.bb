SUMMARY = "German localization files for LibreOffice"
DESCRIPTION = "Provides German translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-de-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "e4994e176b92b984764f0ed28308d01969c4a2c982e1b791cbdbe342e21603c27b2b1ad0215f9e11cb7451e380d8a99e903b1bd10046e14ca218ebefdf8ba97a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-de libreoffice-l10n-de locale(libreoffice:de)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-de"

inherit rpm

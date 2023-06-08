SUMMARY = "Polish localization files for LibreOffice"
DESCRIPTION = "Provides Polish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-pl-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "178581985265409d50f69177b73a6df1284060a3a795f22819bff26fd5444618e4accd2e5dfc53cf6f98bfa25a320413a432d312d0614b652a4451920296b981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pl libreoffice-l10n-pl locale(libreoffice:pl)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-pl_PL"

inherit rpm

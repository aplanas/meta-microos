SUMMARY = "Amharic localization files for LibreOffice"
DESCRIPTION = "Provides Amharic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-am-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "89a9040bdd152fdb2e22b6fd8a09847fa82388a683c0af155c321c5dd1fd742d8980da9d70cc4b75f312208fadcb651032cd4d0d996457cf2275d4f3feb75f69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-am libreoffice-l10n-am locale(libreoffice:am)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

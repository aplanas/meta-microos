SUMMARY = "Thai localization files for LibreOffice"
DESCRIPTION = "Provides Thai translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-th-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "f5d319761b7cf2ee2115ad6b842e09b5d0e0a6091ead12445b21c7f9b1adab1f07ddf677308e248811ba50d171a989f46db7e3927a0f9062ee6015cde0c1f22e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-th libreoffice-l10n-th locale(libreoffice:th)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-th_TH"

inherit rpm

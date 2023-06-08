SUMMARY = "Tatar localization files for LibreOffice"
DESCRIPTION = "Provides Tatar translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-tt-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "05d672beaa38d6fa9211222cc0c38ae06ad1d58d2126813a6b702926722bd07f47bf4b5323279de664a26634c3f72f86658a00804aa5241c3834c2e05c7a9298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tt libreoffice-l10n-tt locale(libreoffice:tt)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

SUMMARY = "Bulgarian localization files for LibreOffice"
DESCRIPTION = "Provides Bulgarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-bg-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "e8b91f01f3c4c540fb6369148e131f8b090c53ff6a4c3a795b439ce8db08795a0be26eb5613cabe80841bff80d10990a25be673c4417cc5746113b83041e93b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bg libreoffice-l10n-bg locale(libreoffice:bg)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-bg_BG"

inherit rpm

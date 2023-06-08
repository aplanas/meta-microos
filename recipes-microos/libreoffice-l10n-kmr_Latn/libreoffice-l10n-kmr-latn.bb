SUMMARY = "Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-kmr_Latn-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "c02b8f3cc5785b984d92e2d68a96de90585bb4c6b534a0488ee1ab5a282e9c595bbf90820e2a2f591799978391b6ddbd0d5129bb925c787f8f89f7bcf0c36806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kmr-Latn libreoffice-help-kmr_Latn libreoffice-l10n-kmr_Latn locale(libreoffice:kmr_Latn)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-kmr_Latn"

inherit rpm

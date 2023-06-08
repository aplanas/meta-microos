SUMMARY = "Bokmal localization files for LibreOffice"
DESCRIPTION = "Provides Bokmal translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-nb-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "8f979103650dc4ece3bb63f0d1111b7f6f958c7ca5c490f1560b65ed0115118d3ebd4cf7442da1faa4d196259edfe8fe156e1d1533ceaf1b73a6eb74443a7af3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nb libreoffice-l10n-nb locale(libreoffice:nb)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-no"

inherit rpm

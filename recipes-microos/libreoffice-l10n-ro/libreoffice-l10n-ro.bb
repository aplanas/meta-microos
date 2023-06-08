SUMMARY = "Romanian localization files for LibreOffice"
DESCRIPTION = "Provides Romanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ro-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "8e5cd2974c2f83967d3c41ad831b1c5c716186a4ff9d5db7d7f576394b5a8c80323fc71dd2f5414aa5cff65ad14806ddc0c57b81c970b333fb70c734feab6416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ro libreoffice-l10n-ro locale(libreoffice:ro)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-ro"

inherit rpm

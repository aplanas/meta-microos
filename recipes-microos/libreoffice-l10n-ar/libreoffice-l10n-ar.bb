SUMMARY = "Arabic localization files for LibreOffice"
DESCRIPTION = "Provides Arabic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ar-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "b57750ee792706ed6361c1725bfba9f75ae01a41ba6873e5b0cb6a63ec95ce9d98bd30388352ae8b1feef0d1f68407dcd29bda79406be021b9c13e8b8f521c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ar libreoffice-l10n-ar locale(libreoffice:ar)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-ar"

inherit rpm

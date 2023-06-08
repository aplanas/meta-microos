SUMMARY = "English localization files for LibreOffice"
DESCRIPTION = "Provides English translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-en-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "a35c99e694b2105944f48a69d1628d4aee57b40d171dbba5fd6de3ee4b8a8e2b47e064b90c6b4b817b923e5e17bab03c7ad4c02a1805500418bc5ace9b57d7d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en libreoffice-help-en-US libreoffice-l10n-en locale(libreoffice:en)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-en"

inherit rpm

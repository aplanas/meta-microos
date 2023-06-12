SUMMARY = "Polish localization files for LibreOffice"
DESCRIPTION = "Provides Polish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-pl-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "81c654b7a6d1082bf5f9fe09e61e0170dc8c764221d4b962b9c798305a6c440ca6e55e7b6b9da10409b2b96b1d5c92ef2496d5681871b0c8ceb5f4b5a4147c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pl libreoffice-l10n-pl locale(libreoffice:pl)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-pl_PL"

inherit rpm

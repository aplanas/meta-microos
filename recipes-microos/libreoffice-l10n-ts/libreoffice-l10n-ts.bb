SUMMARY = "Tsonga localization files for LibreOffice"
DESCRIPTION = "Provides Tsonga translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ts-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "152cdde85680b83e6d7c87fd51621264a5ffde6fa443dcfec86900a4b30dcce799b0e9214c2af5c319e9c7770013218b6fa0083c5f492802f77ff7545a7cafef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ts libreoffice-l10n-ts locale(libreoffice:ts)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

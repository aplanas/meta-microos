SUMMARY = "Tamil localization files for LibreOffice"
DESCRIPTION = "Provides Tamil translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ta-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "6f8384ccb9e15829b8bbf2c6979838dd73e9eaffde4924ade631fa2b53d42391819a240429d2b2456807e5b1bc762a35e4fbf517d71762fbfcc72da1116e57d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ta libreoffice-l10n-ta locale(libreoffice:ta)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

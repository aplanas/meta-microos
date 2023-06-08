SUMMARY = "Macedonian localization files for LibreOffice"
DESCRIPTION = "Provides Macedonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-mk-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "0f95d81d5c7928584202ecda9661b045a74f18293ed3f52266a2273ea322a35663464fb26163a7b4c976929341cf91e0a6d3b442ac498ae38f6ae5ca6b644c1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mk libreoffice-l10n-mk locale(libreoffice:mk)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

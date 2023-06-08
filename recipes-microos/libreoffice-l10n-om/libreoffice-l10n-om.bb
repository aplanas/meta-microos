SUMMARY = "Oromo localization files for LibreOffice"
DESCRIPTION = "Provides Oromo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-om-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "b9a81116fd33e65858194f8cd6a767cc6c4a682159e95e70a9da86a7d86de19318253bf7ad6ceea2c1582600056c8711f0f9d283db04d99d7e3a19a6f814fcdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-om libreoffice-l10n-om locale(libreoffice:om)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

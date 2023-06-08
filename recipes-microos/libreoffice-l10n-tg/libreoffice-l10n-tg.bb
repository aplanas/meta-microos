SUMMARY = "Tajik localization files for LibreOffice"
DESCRIPTION = "Provides Tajik translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-tg-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "23522bc80a8454c3806c45a8df3e14ce9d997ecbc33637102274c225fcadc7981f82d0355d570faf8f29ee6566cc3fa7e373b68b9355489735ea12ded8d7ddfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tg libreoffice-l10n-tg locale(libreoffice:tg)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

SUMMARY = "Manipuri localization files for LibreOffice"
DESCRIPTION = "Provides Manipuri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-mni-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "2989f7f0774d443b945135f5490b02cff41738fc3882080777200d670b546403e9f4108688523e8beeef420aa945a13b21c19eabd2d19714721628068c9adefc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mni libreoffice-l10n-mni locale(libreoffice:mni)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

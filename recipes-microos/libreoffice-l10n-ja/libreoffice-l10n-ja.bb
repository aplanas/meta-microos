SUMMARY = "Japanese localization files for LibreOffice"
DESCRIPTION = "Provides Japanese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ja-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "2cac62479d94deffed41287915ca1b3b7f2489ce0bd81e00cc1b9d0d1965dd9b3057d0211d07233d483477b1624cf14054b7d98fc88de31e78f079ba556ab545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ja libreoffice-l10n-ja locale(libreoffice:ja)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

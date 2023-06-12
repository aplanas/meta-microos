SUMMARY = "Tsonga localization files for LibreOffice"
DESCRIPTION = "Provides Tsonga translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ts-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "b1b97f2c03e5cd575849f7c7b641a22ae7e9af6ef22059948cd09b87c997e75eef57916ab1c78dfe22a24f9c52788e10a2d0bb4b5b7e82a5ce3087bc70c4bd12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ts \
libreoffice-l10n-ts \
locale(libreoffice:ts)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

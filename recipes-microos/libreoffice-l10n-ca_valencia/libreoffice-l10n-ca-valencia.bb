SUMMARY = "Valencian localization files for LibreOffice"
DESCRIPTION = "Provides Valencian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ca_valencia-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "49bd6292b443bced975f65bf3ae0bb54b7690a0bf0ed6a71a624f21929cfa5032b9ad1ec62dbfd1225e5775adba41c4136a798e593186659cc239b6a6a0152e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca-valencia \
libreoffice-help-ca_valencia \
libreoffice-l10n-ca_valencia \
locale(libreoffice:ca_valencia)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca_ES_valencia"

inherit rpm

SUMMARY = "Uyghur localization files for LibreOffice"
DESCRIPTION = "Provides Uyghur translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ug-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "f82901eae7a6cb08ea3d8a60ad83cad693809d5269c2a481cfcbf85ca5d36ebade0364696843aa2088cf0d94ef1a99cb3a4df5777705313299c00a0af2adf189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ug \
libreoffice-l10n-ug \
locale(libreoffice:ug)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

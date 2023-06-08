SUMMARY = "Uyghur localization files for LibreOffice"
DESCRIPTION = "Provides Uyghur translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ug-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "a42c49785fd153bdacdf0f4699f759a323f05781d7ab559b5e842fab7775e977a09e9c998df1ca5d0de1e22b13c15ed546c5de60b0ed6d3be78f47fb92b7c970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ug libreoffice-l10n-ug locale(libreoffice:ug)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

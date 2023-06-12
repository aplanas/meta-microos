SUMMARY = "Oromo localization files for LibreOffice"
DESCRIPTION = "Provides Oromo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-om-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "fe1b60a7bc98f7c151575022478ef16bfd8472c121466ddf21246363966a26e99e121cd2fd7485c629e15270452f4c78946775cc392f6df483d00ccb06ba9b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-om libreoffice-l10n-om locale(libreoffice:om)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

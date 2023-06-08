SUMMARY = "Luxembourgish localization files for LibreOffice"
DESCRIPTION = "Provides Luxembourgish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-lb-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "98c55ec20370fe385b1c845b7b5c1d8619a3c194ccbfc5842806d90b7176c2ffbf064ba5f2779e3ed0637e19ba1109d59a9814abdc58b39cb90f87cd343ee343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lb libreoffice-l10n-lb locale(libreoffice:lb)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

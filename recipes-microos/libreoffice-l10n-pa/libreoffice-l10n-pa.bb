SUMMARY = "Punjabi localization files for LibreOffice"
DESCRIPTION = "Provides Punjabi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-pa-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "318c87792914eea375c9e05670da22589c14a8c77dea919dba0972184c771faf99ab1dce46474948e9136c563e77087ec7ea7d863f4f9616d329eaca4796fa1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pa libreoffice-help-pa-IN libreoffice-l10n-pa libreoffice-l10n-pa-IN locale(libreoffice:pa)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

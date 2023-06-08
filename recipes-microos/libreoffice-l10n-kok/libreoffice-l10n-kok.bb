SUMMARY = "Konkani localization files for LibreOffice"
DESCRIPTION = "Provides Konkani translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-kok-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "38e1c62de39ba240bba3efa6c9306d936c50db029e19b6b5c5367fead806df4ab4048a6853764034c38fbad7cb205de3b922d1acc77006a3c16bbe964eff29d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kok libreoffice-l10n-kok locale(libreoffice:kok)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

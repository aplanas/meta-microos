SUMMARY = "Afrikaans localization files for LibreOffice"
DESCRIPTION = "Provides Afrikaans translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-af-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "a0e9d175bfdc2482a7365e11adc9bcf4361c5055b543f7cc8b2dc61cd1ef054f53bab1e06fb028c2ffdd334113a04f8bc106502a283fa5e7624748e95946356f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-af libreoffice-l10n-af locale(libreoffice:af)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-af_ZA"

inherit rpm

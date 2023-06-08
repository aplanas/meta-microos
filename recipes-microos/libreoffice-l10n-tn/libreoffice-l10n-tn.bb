SUMMARY = "Tswana localization files for LibreOffice"
DESCRIPTION = "Provides Tswana translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-tn-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "e9cf1609235483679b87d26e3aa77cdcab8b31f45745c080619989a3930769781fcdc65618c4e461a74eb4510c88bf81c33ace19a1c1db53bfc407088c1e7b55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tn libreoffice-l10n-tn locale(libreoffice:tn)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

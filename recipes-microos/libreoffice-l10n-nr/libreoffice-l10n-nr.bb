SUMMARY = "Southern_Ndebele localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Ndebele translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-nr-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "8ddbd6936ed54b021bf16b77b8b9e045f4646a78e2fccc6f21bb7af0661986341d24c109b0b1426a9261c8e21bac0bfdac2098b181106735b84f6b948353841c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nr libreoffice-l10n-nr locale(libreoffice:nr)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

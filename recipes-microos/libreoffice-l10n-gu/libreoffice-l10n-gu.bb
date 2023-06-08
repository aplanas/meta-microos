SUMMARY = "Gujarati localization files for LibreOffice"
DESCRIPTION = "Provides Gujarati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-gu-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "844484909dfbdbb7201013e2c121eff4b16480af2ccd8436673a73b6cb7973e61fc6dee4d5a894b393736481cbeaeeb1100c453939637f836fe97a9b72b87181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gu libreoffice-help-gu-IN libreoffice-l10n-gu libreoffice-l10n-gu-IN locale(libreoffice:gu)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-gu_IN"

inherit rpm

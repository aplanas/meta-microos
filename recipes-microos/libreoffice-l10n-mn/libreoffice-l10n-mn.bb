SUMMARY = "Monglolian localization files for LibreOffice"
DESCRIPTION = "Provides Monglolian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-mn-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "b4f6c882630ae5c6e5efdb4b5543f408f9f8eda262a93f37a6e6b10570233f95b25975b9d9d441e534391f6c8a428a2930bc96366a69a83d012e23746b2f3aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mn libreoffice-l10n-mn locale(libreoffice:mn)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

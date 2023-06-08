SUMMARY = "Swati localization files for LibreOffice"
DESCRIPTION = "Provides Swati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ss-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "29f6344e0ef4f08e89bdd60b496c1156c45781aeacabca1c80ba2910be51c7c7686a0993d575b8f1bd0a109679fcd14758559603d24fb0dff00176f7fcd618d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ss libreoffice-l10n-ss locale(libreoffice:ss)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

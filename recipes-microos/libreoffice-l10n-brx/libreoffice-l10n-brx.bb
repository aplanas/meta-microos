SUMMARY = "Bodo localization files for LibreOffice"
DESCRIPTION = "Provides Bodo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-brx-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "4a55b6be4ccb5e246fb580abf4af6863e363a77ab0cf52beb5b1aed7bf199507f85f70c24abaa1c11a7a98ecedf3f45505e2e14a03b9d94944f4a0d593ef6d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-brx libreoffice-l10n-brx locale(libreoffice:brx)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

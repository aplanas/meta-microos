SUMMARY = "Marathi localization files for LibreOffice"
DESCRIPTION = "Provides Marathi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-mr-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "c84dc94ed89984525109007d25b118ba3858827a5f13d8acff51d9ed2a0588b866061eb0d946f4353c78ee77698c675faf076197e9525e056d553359a2983931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mr libreoffice-l10n-mr locale(libreoffice:mr)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

SUMMARY = "Korean localization files for LibreOffice"
DESCRIPTION = "Provides Korean translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ko-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "97a4087df0c00a4095f453d65d20230bbad83f06b67e09a0c7da4521f7fadc07b351833fef8115e178779ae0d7361584aa1b179c5a95bd88bf696abd777ed8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ko libreoffice-l10n-ko locale(libreoffice:ko)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

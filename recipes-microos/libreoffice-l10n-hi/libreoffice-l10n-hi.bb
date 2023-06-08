SUMMARY = "Hindi localization files for LibreOffice"
DESCRIPTION = "Provides Hindi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-hi-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "adbae80b93d37c2a9e29d0ecc7e07cb8c6f60af9ffa752408166ebbc2de7f6abb887b1afea5fedf2ce6fe16d3ebf3c06975379ae4781f1e59699b930f836f2a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hi libreoffice-help-hi-IN libreoffice-l10n-hi libreoffice-l10n-hi-IN locale(libreoffice:hi)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-hi_IN"

inherit rpm

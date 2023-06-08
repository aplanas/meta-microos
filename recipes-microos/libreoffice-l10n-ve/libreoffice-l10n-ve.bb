SUMMARY = "Venda localization files for LibreOffice"
DESCRIPTION = "Provides Venda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ve-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "425a1f819a60400859ee47f7706f3af4626b1c704b9c9b66fca21c7de1cbcdc66d99bc9eb29d78e410f45c4fc750be4c0df929faeb1d257b00b0c4caf51260ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ve libreoffice-l10n-ve locale(libreoffice:ve)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

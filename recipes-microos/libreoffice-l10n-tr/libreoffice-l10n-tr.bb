SUMMARY = "Turkish localization files for LibreOffice"
DESCRIPTION = "Provides Turkish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-tr-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "e2ce2fb874a46eb8bfacd1e4ffecb7589e1716cde6737459433a6b80eb395d00784ddd1709a0a32e656a74fa1cc301f9ca699c448d199b6eba17a994cdd04895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tr libreoffice-l10n-tr locale(libreoffice:tr)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-tr_TR"

inherit rpm

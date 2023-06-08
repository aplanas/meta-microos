SUMMARY = "Serbian localization files for LibreOffice"
DESCRIPTION = "Provides Serbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-sr-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "9716eae117669a18dbfb18bf04c2c947c3bf05efa1e9f883825e6faa52cce5dbbf05bbf6c84e3540028ef941dc579d97685c84a4a4b2c1c9b9a3af687d599cb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sr libreoffice-l10n-sr locale(libreoffice:sr)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-sr"

inherit rpm

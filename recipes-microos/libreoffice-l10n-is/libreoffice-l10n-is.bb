SUMMARY = "Icelandic localization files for LibreOffice"
DESCRIPTION = "Provides Icelandic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-is-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "1eeee53347eee2e253859c530194f23121ecea8edcd8f94211c275a30c2a84336e7b9891b5a7ebf238d0b558b3fde47d91111719298848d42e349f8de1d8f027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-is libreoffice-l10n-is locale(libreoffice:is)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-is"

inherit rpm

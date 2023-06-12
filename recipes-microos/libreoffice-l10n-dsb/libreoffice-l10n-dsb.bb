SUMMARY = "Lower_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Lower_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-dsb-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "c8867efa4361b4df84f372d16bbb940a0a3923fa7db6414bf93dcddbe21898da7fc1cfd244e6bc67aceb9d96096f72a46411bbab832b69404a8e14fa5774c872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dsb libreoffice-l10n-dsb locale(libreoffice:dsb)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm

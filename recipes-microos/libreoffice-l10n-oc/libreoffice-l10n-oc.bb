SUMMARY = "Occitan localization files for LibreOffice"
DESCRIPTION = "Provides Occitan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-oc-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "d8a94c4cb31bc3319ad0039739d2cc8924e1b96a2dc17eba1faa67d91e5557724382bc17233d49d4655d96658f53822d0beb5982d343fcd693803fefe457ac22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-oc libreoffice-l10n-oc locale(libreoffice:oc)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-oc_FR"

inherit rpm

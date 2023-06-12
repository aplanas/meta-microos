SUMMARY = "Frisian localization files for LibreOffice"
DESCRIPTION = "Provides Frisian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-fy-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "4126520169f51702bc1088f17cbb70428e15d1ef7d5e19fda27064efccaccdfed2561b4dfea5ef99210c690198fc876d9dba08248e65566a254afe24c11fe847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fy \
libreoffice-l10n-fy \
locale(libreoffice:fy)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

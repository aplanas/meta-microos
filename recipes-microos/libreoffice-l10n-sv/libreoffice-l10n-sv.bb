SUMMARY = "Swedish localization files for LibreOffice"
DESCRIPTION = "Provides Swedish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-sv-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "dbd2fcbbebab88243ceb2fc90b6165a35dae129bc902506c8166a70be4415c2aeab3e0ab3389cdd778b3553b976663815d714829a32e622e4f44fc3af2012c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sv libreoffice-l10n-sv locale(libreoffice:sv)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-sv_SE"

inherit rpm

SUMMARY = "Albanian localization files for LibreOffice"
DESCRIPTION = "Provides Albanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-sq-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "3211b21ccdcf2d6fa46f911da543a82a90db6af871def69026307092ee813b10b0f951de5a092c6a93b2bb74a087c5be1512acc3bb77f5d7fe77de39d01d406b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sq libreoffice-l10n-sq locale(libreoffice:sq)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-sq_AL"

inherit rpm

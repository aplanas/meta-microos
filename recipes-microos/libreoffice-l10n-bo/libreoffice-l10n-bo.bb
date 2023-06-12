SUMMARY = "Tibetian localization files for LibreOffice"
DESCRIPTION = "Provides Tibetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-bo-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "f804db8eb10039bd4c75ba1df2029f6e044a969e94f4ae4ff3a38a4e267060cb8d7fb3f80f7c44641f21075646ab2393194c7b812f8871383b8709c5453cc8ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bo libreoffice-l10n-bo locale(libreoffice:bo)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-bo"

inherit rpm

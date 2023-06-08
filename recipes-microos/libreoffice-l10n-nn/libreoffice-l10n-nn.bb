SUMMARY = "Nynorsk localization files for LibreOffice"
DESCRIPTION = "Provides Nynorsk translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-nn-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "e255e2636a8d03ac3b7384a5238e2db7a66ba5d68252b9b8f982fac32eef69d3cc36d792e7191bbd4d97fabea6d8615eb2166c259856e4572369691c9aa61ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nn libreoffice-l10n-nn locale(libreoffice:nn)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-nn_NO"

inherit rpm

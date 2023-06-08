SUMMARY = "Support for creating LibreOffice dialogs in glade"
DESCRIPTION = "libreoffice-glade contains a catalog of LibreOffice-specific widgets for \
glade and ui-previewer tool to check the visual appearance of dialogs."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-glade-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "ad88e932d1e63783696cdb48b715de93d5f4535065b46bf804ffa43f29aa1443cb7a48bf2a1d4c543526acfc46aaf86a8296216bbd7631fcfdc6148c1c0d44e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-glade"
RDEPENDS:${PN} += "libreoffice"

inherit rpm

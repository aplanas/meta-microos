SUMMARY = "KDE Konqueror Libraries: Build Environment"
DESCRIPTION = "Development package for the konqueror libraries."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "konqueror-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7cd5d970261879931521b7f6853bb42a4e31a9c37953b4685b176d35392963c1624a56603a93a85c144d3f45ae9d93aebebbeaab1d56e65ff85b8c92c9a24211"

RPROVIDES:${PN} += "cmake(KF5Konq) kde-baseapps-devel kde-baseapps5-devel konqueror-devel konqueror-devel(aarch-64) libkonq-devel"
RDEPENDS:${PN} += "konqueror"

inherit rpm

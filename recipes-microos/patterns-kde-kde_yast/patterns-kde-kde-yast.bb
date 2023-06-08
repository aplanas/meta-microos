SUMMARY = "YaST KDE User Interfaces"
DESCRIPTION = "Graphical YaST user interfaces for the KDE desktop."
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_yast-20230403-1.1.noarch.rpm"
RPM_HASH = "908248ec67c0ed6d1d79451f9e3b74381f5789982f273e764d78aaada69e003ad254dc13ff8da4cd89b01b5cfbe95b6bfd4b6d3c9cfae079d982e363c71257b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-kde-kde_yast patterns-kde-sw_management_kde patterns-openSUSE-kde4_yast patterns-openSUSE-kde_yast patterns-openSUSE-sw_management_kde patterns-openSUSE-sw_management_kde4"
RDEPENDS:${PN} += "libyui-qt-pkg yast2-control-center-qt"

inherit rpm

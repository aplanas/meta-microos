SUMMARY = "YaST Base Utilities"
DESCRIPTION = "YaST tools for basic system administration."
LICENSE = "MIT"

PV = "20220411"

RPM_NAME = "patterns-yast-yast2_basis-20220411-1.4.aarch64.rpm"
RPM_HASH = "dce90222d1367e2b5d8ed6f26e14ea382df07be6f7156a76b3f093b0fb3f1d236d815c0db28c1ef1f21945b5bde8fc62a8ab51127d8a94eea9ffbe3e4923a346"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-yast-yast2_basis \
patterns-yast-yast2_basis(aarch-64)"
RDEPENDS:${PN} += "libyui-ncurses-pkg \
yast2 \
yast2-alternatives \
yast2-firewall \
yast2-packager \
yast2-theme"

inherit rpm

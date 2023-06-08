SUMMARY = "YaST User Interfaces"
DESCRIPTION = "Graphical YaST user interfaces for minimal X desktop."
LICENSE = "MIT"

PV = "20220411"

RPM_NAME = "patterns-yast-x11_yast-20220411-1.4.aarch64.rpm"
RPM_HASH = "1a4590e46c1e11e3a32b73ce86e15fdf396aeb7f1b36b784d4dddc1aed5d315ea05e6f1d9bffbd4cdefc46ae1e50e2f2c684b792e83d158322e88c23959ca714"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() pattern-visible() patterns-yast-x11_yast patterns-yast-x11_yast(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

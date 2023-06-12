SUMMARY = "Collection of LPEG patterns"
DESCRIPTION = "A collection of LPEG patterns \
 \
Use cases: \
 * Strict validation of user input \
 * Searching free-form input"
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "lua54-lpeg_patterns-0.5-2.7.noarch.rpm"
RPM_HASH = "f181d62acd9c29d5248b9c5399e1d3b98bfcaa7581fd03db7f19e1c2456cea55ab419c220bc6a4190d3784590c0c96b60d9ef7beebf639072c85700513c47e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-lpeg_patterns \
lua54-lpeg_patterns"
RDEPENDS:${PN} += "lua54 \
lua54-lpeg"

inherit rpm

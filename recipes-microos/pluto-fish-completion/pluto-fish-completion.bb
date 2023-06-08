SUMMARY = "Fish Completion for pluto"
DESCRIPTION = "Fish command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.16.1"

RPM_NAME = "pluto-fish-completion-5.16.1-1.1.noarch.rpm"
RPM_HASH = "8737d6ec820516ea4cffd00c165d41c1e991444c19997d3f9fcf761daf8bb88ce7119184349bcd3d2031c6f965e13ea8ac5914185a0832c6257c35fa703344e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-fish-completion"
RDEPENDS:${PN} += "pluto"

inherit rpm

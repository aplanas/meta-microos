SUMMARY = "Front-end component renderer for Dash"
DESCRIPTION = "Front-end component renderer for Dash."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python39-dash-renderer-1.9.1-1.10.noarch.rpm"
RPM_HASH = "7bd3501f18b0d2f47898a52341035b480736c1d848c9c1e2f93bd56f95ce98f21529244d141e4e8ea191cadf663209a48fc0d28ab450d694bf44bbb6881d03cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dash-renderer) python39-dash-renderer python3dist(dash-renderer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

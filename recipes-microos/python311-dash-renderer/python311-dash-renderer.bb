SUMMARY = "Front-end component renderer for Dash"
DESCRIPTION = "Front-end component renderer for Dash."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python311-dash-renderer-1.9.1-1.10.noarch.rpm"
RPM_HASH = "de9e829d1ccebcce095ce58be429d295950c8e26f1be165c19e1d81f2634e5a1888c7983dfb1c6944a33b6b5ae5a3d97109ad56245d54df484e095c212e9c8dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dash-renderer) \
python311-dash-renderer \
python3dist(dash-renderer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

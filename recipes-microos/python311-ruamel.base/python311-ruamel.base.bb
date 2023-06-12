SUMMARY = "Shared ruamel routines"
DESCRIPTION = "This is a common package for the 'ruamel' namespace."
LICENSE = "MIT"

PV = "1.0.0+post1"

RPM_NAME = "python311-ruamel.base-1.0.0+post1-2.14.noarch.rpm"
RPM_HASH = "41721661f747ece8f7edcd55fe7bc981e1f2183774b99f90e86a3a8d09d396a051667b7e4384cb7867f990b8b1cf600236172d639c1cbe2078fb76bde8abf592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ruamel.base) \
python311-ruamel.base \
python3dist(ruamel.base)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

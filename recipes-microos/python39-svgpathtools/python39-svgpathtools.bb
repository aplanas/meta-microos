SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-svgpathtools-1.6.0-1.2.noarch.rpm"
RPM_HASH = "5fb1d12c7fb5fddfb1a303efad05c4caaf908cd372a348842e3c584a6742eee6e207537afc2c3876151200f9bcd295d29af4226f3db6e59539dafa5b1cb5cd03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(svgpathtools) python39-svgpathtools python3dist(svgpathtools)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-scipy python39-svgwrite"

inherit rpm

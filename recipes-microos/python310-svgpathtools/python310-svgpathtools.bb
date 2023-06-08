SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-svgpathtools-1.6.0-1.2.noarch.rpm"
RPM_HASH = "b27a8b11ec5988b87d0d228f921e9daa73f521e30492aa18d84093cb301e1729c74ab28eaea05c87d7a064a6d33b9a042036e9b20ea627c5cda4bec5081429ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svgpathtools python3.10dist(svgpathtools) python310-svgpathtools python3dist(svgpathtools)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-scipy python310-svgwrite"

inherit rpm

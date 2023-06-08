SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-svgpathtools-1.6.0-1.2.noarch.rpm"
RPM_HASH = "34942030ec7aee91079c672d61c616d8c1d276ce4b154cd4fe8737298e9cde684157bca0528ee3c8e0716eb924a4413c7bef6b5ce84c0f0404e10e70f263a9a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(svgpathtools) python311-svgpathtools python3dist(svgpathtools)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-scipy python311-svgwrite"

inherit rpm

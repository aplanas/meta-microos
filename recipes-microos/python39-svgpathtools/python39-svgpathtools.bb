SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python39-svgpathtools-1.6.1-1.1.noarch.rpm"
RPM_HASH = "994f11c2d75c6117c7c861f428b15298a3741d89a116ce29d5f97536475ea84a7f5079563d93472f4126f4079409e3268c5b63f3c712eacec22c06b664de3620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(svgpathtools) \
python39-svgpathtools \
python3dist(svgpathtools)"
RDEPENDS:${PN} += "python(abi) \
python39-numpy \
python39-scipy \
python39-svgwrite"

inherit rpm

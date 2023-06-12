SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python311-svgpathtools-1.6.1-1.1.noarch.rpm"
RPM_HASH = "a79e06b408d2c979b0072a828f8b501443779e8a5cfd371b5583fb09b4eae97efd7454d2e92ebf5da40e2529e40e9e6fbf93b9c18bf44a356a0a4c3cac4ec69e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(svgpathtools) python311-svgpathtools python3dist(svgpathtools)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-scipy python311-svgwrite"

inherit rpm

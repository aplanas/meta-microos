SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python310-svgpathtools-1.6.1-1.1.noarch.rpm"
RPM_HASH = "83371756844180ace0479f3824e199c880785dcf6ed4708e41820789ae839e9ff7d0b6683333b6b1344465d25fb9415f726ee8e29a39e3b78851cdf266c9a5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svgpathtools python3.10dist(svgpathtools) python310-svgpathtools python3dist(svgpathtools)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-scipy python310-svgwrite"

inherit rpm

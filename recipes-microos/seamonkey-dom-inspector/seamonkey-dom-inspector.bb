SUMMARY = "The SeaMonkey DOM Inspector"
DESCRIPTION = "This is a tool that allows you to inspect the DOM for web pages in \
SeaMonkey. This is of great use to people who are doing SeaMonkey \
chrome development or web page development."
LICENSE = "MPL-2.0"

PV = "2.53.16"

RPM_NAME = "seamonkey-dom-inspector-2.53.16-1.1.aarch64.rpm"
RPM_HASH = "e81a7b4d3f9a7cf5b2956d2f438fa540297240393a85af27e26da647c6a4e070bc8cb923d26b5934f3aeb6b51bb3aaa53a85f8ea739c4ad7ca1b9ae4dfc57a6e"

RPROVIDES:${PN} += "seamonkey-dom-inspector seamonkey-dom-inspector(aarch-64)"
RDEPENDS:${PN} += "seamonkey"

inherit rpm

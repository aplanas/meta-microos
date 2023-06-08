SUMMARY = "xSGE Lighting Library"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides an interface for lighting."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python310-xsge_lighting-1.0.2-1.7.noarch.rpm"
RPM_HASH = "79dcc7c496fcce8e67c5d5bbf20f64ac8403b44a63edde45a4dac02111f251f8ddd8ece8949873aae2417ebeb8b5b3f28954ff17179f3ab3a97f26e5cd4f354b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge_lighting python3.10dist(xsge-lighting) python310-xsge_lighting python3dist(xsge-lighting)"
RDEPENDS:${PN} += "python(abi) python310-sge-pygame python310-six"

inherit rpm

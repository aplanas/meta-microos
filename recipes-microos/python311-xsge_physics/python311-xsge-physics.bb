SUMMARY = "xSGE Physics Framework"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a framework for collision physics. \
This can be useful for platformers."
LICENSE = "GPL-3.0-or-later"

PV = "0.13.2"

RPM_NAME = "python311-xsge_physics-0.13.2-1.7.noarch.rpm"
RPM_HASH = "5f5d8c3815185d83794d56217241e9010c325e698063b6be87a49abb65060b3416c0cd485e78222363ec16ebe2814f29b6c461db917a1a43655b1d0e17ebe9c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xsge-physics) python311-xsge_physics python3dist(xsge-physics)"
RDEPENDS:${PN} += "python(abi) python311-sge-pygame"

inherit rpm

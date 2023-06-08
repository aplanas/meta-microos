SUMMARY = "xSGE Particles"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides particle effects for SGE."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "python311-xsge_particle-1.0-1.7.noarch.rpm"
RPM_HASH = "0abf83cf5c07e32b439fd15acb0956d01a252f8384c372444b7b6b17497d9c7371b34cf3d311d5b7eac3ebeb90df57fe4613380340f6a758abd3b199c28c4d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xsge-particle) python311-xsge_particle python3dist(xsge-particle)"
RDEPENDS:${PN} += "python(abi) python311-sge-pygame python311-six"

inherit rpm

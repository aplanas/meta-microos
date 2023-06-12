SUMMARY = "xSGE Path"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides paths for the SGE.  Paths are used to make \
objects move in a certain way."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python39-xsge_path-1.0.2-1.7.noarch.rpm"
RPM_HASH = "00d31e5c96d345e0c0843d2c0501385a22251964990f3448a0b45d13d67520ac6ff97cf5deafbf7ee275018498e35106cb3eb207299fce0397820e12ff735883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xsge-path) \
python39-xsge_path \
python3dist(xsge-path)"
RDEPENDS:${PN} += "python(abi) \
python39-sge-pygame"

inherit rpm

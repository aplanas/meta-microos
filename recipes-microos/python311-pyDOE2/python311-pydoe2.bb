SUMMARY = "Design of experiments for Python"
DESCRIPTION = "The pyDOE2 package is a fork of the pyDOE package that is designed to \
help the scientist, engineer, statistician, etc., to construct \
appropriate experimental designs. \
 \
This fork came to life to solve bugs and issues that remained unsolved in the \
original package."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python311-pyDOE2-1.3.0-2.9.noarch.rpm"
RPM_HASH = "223ecd2d565c4d8765ce98532b9238136f99de79548fe80b1d2f1a161be41bac65d0166585b9061dd869ead6ef55352566b3f136356e93b7dd46b28ec0efdff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydoe2) \
python311-pyDOE2 \
python3dist(pydoe2)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-scipy"

inherit rpm

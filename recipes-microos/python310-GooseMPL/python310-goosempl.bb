SUMMARY = "Style and extension functions for matplotlib"
DESCRIPTION = "GooseMPL provides a style and several style extensions for matplotlib, some custom \
functions that extend matplotlib, and several examples to make professional plot \
using matplotlib."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python310-GooseMPL-0.12.1-1.3.noarch.rpm"
RPM_HASH = "536dd3a74b75e58591053ce5587dd41f3e3daa5ab012b0fbec3b4575684abcd4d04b2e2b0f2b6ebdac760364c152140dff6ef4e67dccd13e349731b98ec2be49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GooseMPL \
python3.10dist(goosempl) \
python310-GooseMPL \
python3dist(goosempl)"
RDEPENDS:${PN} += "python(abi) \
python310-PyYAML \
python310-deprecation \
python310-matplotlib \
python310-matplotlib-latex \
python310-numpy \
python310-scipy \
texlive-amsfonts \
texlive-amsmath \
texlive-tools"

inherit rpm

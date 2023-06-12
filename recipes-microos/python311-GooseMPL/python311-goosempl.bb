SUMMARY = "Style and extension functions for matplotlib"
DESCRIPTION = "GooseMPL provides a style and several style extensions for matplotlib, some custom \
functions that extend matplotlib, and several examples to make professional plot \
using matplotlib."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python311-GooseMPL-0.12.1-1.3.noarch.rpm"
RPM_HASH = "58ed756d44d861276f9026c0a4219ef6761860aaf66058c614920eea90a936a6fb2233cce259b8241e09453a585ec2170942c1204f4a12dd24b58ad00acff8d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(goosempl) \
python311-GooseMPL \
python3dist(goosempl)"
RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-deprecation \
python311-matplotlib \
python311-matplotlib-latex \
python311-numpy \
python311-scipy \
texlive-amsfonts \
texlive-amsmath \
texlive-tools"

inherit rpm

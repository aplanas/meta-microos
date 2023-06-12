SUMMARY = "Scales for Python"
DESCRIPTION = "Mizani is a scales package for graphics."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python310-mizani-0.8.1-1.2.noarch.rpm"
RPM_HASH = "ce5ba3b5226afbfd290f59dac8712bbb64f6a136052b59476159e0c14ecd412345702599d3be3b018499686733e4854c3d9fb474df69a0070da903e20756735c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mizani \
python3.10dist(mizani) \
python310-mizani \
python3dist(mizani)"
RDEPENDS:${PN} += "python(abi) \
python310-matplotlib \
python310-numpy \
python310-palettable \
python310-pandas \
python310-scipy"

inherit rpm

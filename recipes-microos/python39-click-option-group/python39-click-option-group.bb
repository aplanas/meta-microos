SUMMARY = "Option groups missing in Click"
DESCRIPTION = "Option groups missing in Click"
LICENSE = "BSD-3-Clause"

PV = "0.5.5"

RPM_NAME = "python39-click-option-group-0.5.5-2.1.noarch.rpm"
RPM_HASH = "9f53f3a79ba85c7da0dfd06b7b1ae309e56bcaed6fb0f1e2d052b7d220c64dd692101961297ce62e5f0d965f3bb5fea4d371374482ffbc68c3ec94a7bd709c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-option-group) \
python39-click-option-group \
python3dist(click-option-group)"
RDEPENDS:${PN} += "python(abi) \
python39-click"

inherit rpm

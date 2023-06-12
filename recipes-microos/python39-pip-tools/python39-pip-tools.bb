SUMMARY = "Tool to keep pinned dependencies up to date"
DESCRIPTION = "pip-tools keeps pinned dependencies inside a project up to date."
LICENSE = "BSD-3-Clause"

PV = "6.12.2"

RPM_NAME = "python39-pip-tools-6.12.2-1.2.noarch.rpm"
RPM_HASH = "5e66f27c5cb7c3a165367bce0523aa4632031a188be32d1612a7d3b559b870c21215ab7d6cd68b9d4733899ac46cc685ea7df2d56344829598b080fdda69cf90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pip-tools) \
python39-pip-tools \
python3dist(pip-tools)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-build \
python39-click \
python39-pip \
python39-setuptools \
python39-wheel"

inherit rpm

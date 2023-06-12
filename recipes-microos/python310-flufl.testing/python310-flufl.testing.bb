SUMMARY = "A small collection of test tool plugins"
DESCRIPTION = "A small collection of test tool plugins"
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python310-flufl.testing-0.8-1.13.noarch.rpm"
RPM_HASH = "49af9f17f6dd8d684a9a896ebb82443d0f4d123faa6a4cd48cd9b7c5b61abe80ca5d24700a1484cfc9107bf3c92c46a4da382c61e3383987b0368d8e754b615b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.testing \
python3.10dist(flufl.testing) \
python310-flufl.testing \
python3dist(flufl.testing)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

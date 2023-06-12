SUMMARY = "Development files for python310-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python310-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python310-pyzmq-devel-25.0.2-1.1.aarch64.rpm"
RPM_HASH = "b468de0e3d4b050724f6a9593e665829bf8b95e92208eadc0c102012d36c170d444f29d0063835b90259b69cf6e0f45b8659fd6f0d83ddb9670bd9c04c84233d"

RPROVIDES:${PN} += "python3-pyzmq-devel \
python310-pyzmq-devel \
python310-pyzmq-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python310-devel \
python310-pyzmq \
zeromq-devel"

inherit rpm

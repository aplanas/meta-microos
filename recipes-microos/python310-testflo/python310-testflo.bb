SUMMARY = "A flow-based testing framework"
DESCRIPTION = "This module provides a flow-based testing framework. testflo supports \
testing of the OpenMDAO framework. Some OpenMDAO features require \
execution under MPI, while others don't. testflo runs all of the \
authors' tests in the same way and allows them to build their tests \
using unittest.TestCase objects that they are familiar with."
LICENSE = "Apache-2.0"

PV = "1.4.9"

RPM_NAME = "python310-testflo-1.4.9-2.4.noarch.rpm"
RPM_HASH = "1dc55b240879c6529ee69ff19abd493820395b273a614dfa8052c1789bce69d9a58499998bed9e8974defe78f8f54eaca8683c9da4081cd5e17bf4c33df66514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testflo \
python3.10dist(testflo) \
python310-testflo \
python3dist(testflo)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm

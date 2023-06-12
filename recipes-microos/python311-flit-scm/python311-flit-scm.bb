SUMMARY = "PEP 518 build backend using setuptools_scm and flit"
DESCRIPTION = "A PEP 518 build backend that uses setuptools_scm to generate a version file \
from your version control system, then flit to build the package."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-flit-scm-1.7.0-2.1.noarch.rpm"
RPM_HASH = "3c20495fa58881124652e82a550e3c8ed4c4fef753ee645d93d38ba5ed503a7c6e8ad995ca4ad6861b105a9f037fab90df693fae5ac3bbb2b671af9b119e0bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flit-scm) \
python311-flit-scm \
python3dist(flit-scm)"
RDEPENDS:${PN} += "python(abi) \
python311-flit-core \
python311-setuptools_scm"

inherit rpm

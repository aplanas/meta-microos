SUMMARY = "Python module for parsing RPM spec files"
DESCRIPTION = "python-rpm-spec is a Python module for parsing RPM spec files. RPMs are build \
from a package's sources along with a spec file. The spec file controls how the \
RPM is built. This module allows you to parse spec files and gives you simple \
access to various bits of information that is contained in the spec file."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python310-python-rpm-spec-0.10-1.11.noarch.rpm"
RPM_HASH = "54af2f1ffc3cdcd178fb19e94ab4615cce5c996199e98ac7fe0977b57e8e877d76bd310e8bd0258a706e8fbc8b357d2a109ac3e6e273e00838ddbcd0431e2860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-rpm-spec python3.10dist(python-rpm-spec) python310-python-rpm-spec python3dist(python-rpm-spec)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

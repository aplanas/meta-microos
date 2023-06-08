SUMMARY = "Python module for parsing RPM spec files"
DESCRIPTION = "python-rpm-spec is a Python module for parsing RPM spec files. RPMs are build \
from a package's sources along with a spec file. The spec file controls how the \
RPM is built. This module allows you to parse spec files and gives you simple \
access to various bits of information that is contained in the spec file."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python311-python-rpm-spec-0.10-1.11.noarch.rpm"
RPM_HASH = "a69f9879f13621d66dd76fd9369cfdfd6b9ba75a9b952f8d50c09bdd5b8616a4d0378f298aaf0376737883c39f1041d2e65e322e3773077e29d69916a008581a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-rpm-spec) python311-python-rpm-spec python3dist(python-rpm-spec)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

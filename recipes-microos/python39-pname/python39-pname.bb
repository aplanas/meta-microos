SUMMARY = "Check whether a package name is available on PyPI"
DESCRIPTION = "Check whether a package name is available on PyPI"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-pname-1.0.2-1.13.noarch.rpm"
RPM_HASH = "c1efe72b909b2c7ed9f2a244788e8a391671180b429bf804e255ee97433540d487f3a55afb36b168c452c3e24d1dae539dba588a219ec41130bc44d645132352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pname) \
python39-pname \
python3dist(pname)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

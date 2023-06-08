SUMMARY = "Man files for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the manual pages for the Sphinx executables."
LICENSE = "BSD-2-Clause"

PV = "7.0.0"

RPM_NAME = "python-Sphinx-doc-man-7.0.0-1.1.noarch.rpm"
RPM_HASH = "7566f80fe97a138ba19a40fff65a26372722224167911be40a33b9b69f0d9a7cd4e19ec1d9f2b92f4aedb8f36b548c9102b6670f82e7b224aa90e18a242cb2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-man"
RDEPENDS:${PN} += "python3-Sphinx update-alternatives"

inherit rpm

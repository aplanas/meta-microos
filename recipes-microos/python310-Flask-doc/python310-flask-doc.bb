SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python310-Flask-doc-2.2.2-2.1.noarch.rpm"
RPM_HASH = "042f5820104c16d12956c60c721a25bc8d0e55055f7598ab11abf9d884d219c84f2d4400f94abbe242f114f6e6a5ab8d0a16d58ca5a09b7d3d906388c153a117"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-doc python310-Flask-doc"
RDEPENDS:${PN} += "python310-Flask"

inherit rpm

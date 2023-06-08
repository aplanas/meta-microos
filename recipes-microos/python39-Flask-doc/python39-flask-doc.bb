SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python39-Flask-doc-2.2.2-2.1.noarch.rpm"
RPM_HASH = "1e99f5a42348f9ad1abb559d1110e342153de242985e0c20847480d95b4bf2283816f87c23a50f27dc185dc35c183a5eb0306917b9e4f5af82b6ccf8f6c9b4d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Flask-doc"
RDEPENDS:${PN} += "python39-Flask"

inherit rpm

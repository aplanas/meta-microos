SUMMARY = "An asynchronous networking framework written in Python - Documentation"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This package contains the documentation for python-Twisted"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python-Twisted-doc-22.10.0-5.1.noarch.rpm"
RPM_HASH = "cd6d5ec0f538b9774f64c960400393b3f07a2d68a4c98e45ab738cc64072c45ff235063a30876008bf8b5881e4d686c8c7b74f7003c755e349f7f15f8b7408bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Twisted-doc"
RDEPENDS:${PN} += ""

inherit rpm

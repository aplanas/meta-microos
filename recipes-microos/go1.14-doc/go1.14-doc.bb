SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.14.15"

RPM_NAME = "go1.14-doc-1.14.15-1.13.aarch64.rpm"
RPM_HASH = "87d0f02d876efb078f358e1a5f1073bab86b96296324ba08a076c3b29a324bc6ef117b38402ba0cc9c1e7310788aeb6b65e681187706b1fb58c10af207b62529"

RPROVIDES:${PN} += "go-doc \
go1.14-doc \
go1.14-doc(aarch-64)"
RDEPENDS:${PN} += "go1.14"

inherit rpm

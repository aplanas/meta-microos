SUMMARY = "A Set of Libraries for Integration with SCAP"
DESCRIPTION = "OpenSCAP is a set of open source libraries providing an easier path for \
integration of the SCAP line of standards. \
 \
SCAP is a line of standards managed by NIST with the goal of providing \
a standard language for the expression of Computer Network Defense \
related information. \
 \
More information about SCAP can be found at nvd.nist.gov."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.7"

RPM_NAME = "openscap-1.3.7-1.1.aarch64.rpm"
RPM_HASH = "1b4af609c7df29956cdcd993f8828f6908fbc299c80b6adeb401c3156b91510ff9c906337ce36ac64a672b5018e912eaeac14bcd7630c379615dc54ffbb393bf"

RPROVIDES:${PN} += "openscap openscap(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

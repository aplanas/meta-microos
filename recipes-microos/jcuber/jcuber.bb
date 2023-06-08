SUMMARY = "Java Cube Reader Library"
DESCRIPTION = "Java Cube Reader Library is a native Java library for reading of a \
multi-dimensional performance space consisting of the dimensions \
(i) performance metric, (ii) call path, and (iii) system resource. \
Each dimension can be represented as a tree, where non-leaf nodes \
of the tree can be collapsed or expanded to achieve the desired level \
of granularity."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "4.4.1"

RPM_NAME = "jcuber-4.4.1-2.14.noarch.rpm"
RPM_HASH = "00f2585bb44afba7e31eeb05c0368b4dab669aef99a6960c11690ec654c67286c1b7eba9eb2f243b8a31f9322ffa05612977b70ac5d3da82c14ff318afdbc4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcuber"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm

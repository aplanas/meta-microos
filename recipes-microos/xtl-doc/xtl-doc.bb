SUMMARY = "Documentation for xtl"
DESCRIPTION = "Basic tools (containers, algorithms) used by other quantstack packages."
LICENSE = "BSD-3-Clause"

PV = "0.7.5"

RPM_NAME = "xtl-doc-0.7.5-1.2.noarch.rpm"
RPM_HASH = "01413e356870fbf274cd6f4d276ce29a62334f438828c6a0d932ae64d4e0be1c39eeaa8307b55a50f9d6652fbb504e246dcb35889a92a00cd075572f420b5e67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xtl-doc"
RDEPENDS:${PN} += ""

inherit rpm

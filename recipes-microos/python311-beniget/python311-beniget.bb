SUMMARY = "Module to extract semantic information about static Python code"
DESCRIPTION = "A module to extract semantic information about static Python code."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python311-beniget-0.4.1-2.1.noarch.rpm"
RPM_HASH = "0143a0441947ed24dce03cf6f14b8ea922c32f7747c98ca11fb384e0ad1d4ff85464db995048b18b42eee3097a6e62464d4e80e860ed2fadb1d01a0de4d6b9c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(beniget) \
python311-beniget \
python3dist(beniget)"
RDEPENDS:${PN} += "python(abi) \
python311-gast"

inherit rpm

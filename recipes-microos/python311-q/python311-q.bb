SUMMARY = "Quick-and-dirty debugging output for tired programmers"
DESCRIPTION = "Quick-and-dirty debugging output for tired programmers."
LICENSE = "Apache-2.0"

PV = "2.7"

RPM_NAME = "python311-q-2.7-1.3.noarch.rpm"
RPM_HASH = "a4fcc40338421b775d1014e0ab3c1c69d7af89dab01864f98e89c4b8c07abc1e764904bfd250a36dc18b6e10869c0cc0d94ecbb77546b182089abe79df2324f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(q) python311-q python3dist(q)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

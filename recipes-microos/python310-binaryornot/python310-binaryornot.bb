SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text, \
using a heuristic similar to Perl's pp_fttext and its analysis \
by eliben."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python310-binaryornot-0.4.4-3.15.noarch.rpm"
RPM_HASH = "6516e060613559b9a5bd360ffc38df62aae06e4cd66057f34496adebb6aad5197f47aeaad801a6e424b21d4dbbafce346b00f955150c51445a4d8328b020c1a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-binaryornot python3.10dist(binaryornot) python310-binaryornot python3dist(binaryornot)"
RDEPENDS:${PN} += "python(abi) python310-chardet"

inherit rpm

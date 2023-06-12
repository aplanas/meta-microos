SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text, \
using a heuristic similar to Perl's pp_fttext and its analysis \
by eliben."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python311-binaryornot-0.4.4-4.1.noarch.rpm"
RPM_HASH = "67dc38349791720f34ea4ca6a5e2aec5844ae21e9cd258285c074797879c8672fbe3190fc2ef5c04e0da7d155fb21e32b8834fc73c09b61dcee02951cb836e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(binaryornot) \
python311-binaryornot \
python3dist(binaryornot)"
RDEPENDS:${PN} += "python(abi) \
python311-chardet"

inherit rpm

SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text, \
using a heuristic similar to Perl's pp_fttext and its analysis \
by eliben."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python39-binaryornot-0.4.4-3.15.noarch.rpm"
RPM_HASH = "bdd115235cdba7355a98455f187f708040ef732f1ab5ec0c3ffd2c5db89dbe257d320c25d9d8fabad62cbab0bd03e6a6911f4fe6d1dd746293655cfe3e811eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(binaryornot) python39-binaryornot python3dist(binaryornot)"
RDEPENDS:${PN} += "python(abi) python39-chardet"

inherit rpm

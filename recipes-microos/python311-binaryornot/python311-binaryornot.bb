SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text, \
using a heuristic similar to Perl's pp_fttext and its analysis \
by eliben."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python311-binaryornot-0.4.4-3.15.noarch.rpm"
RPM_HASH = "4d5472f5c941cf3e38bb5002d262dab08892191adcb40d0662eed0d18c0a8cd76d28de5f8e3db8a64f00ea3149e0ba48c071d36cc0110759909672b471d69753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(binaryornot) python311-binaryornot python3dist(binaryornot)"
RDEPENDS:${PN} += "python(abi) python311-chardet"

inherit rpm

SUMMARY = "An intent parser"
DESCRIPTION = "A intent parser Python module. \
 \
Padaos converts a series of example sentences into one big chunk of \
regex. Each intent is a single compiled regex matcher."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python310-padaos-0.1.10-1.19.noarch.rpm"
RPM_HASH = "f97f800c9df34cf3db6f42a05d8f5318b95fb16cd552c92dbba3bd3f08989aa87e97f578c9eb2d340999261d14aec03d1d485b708c382e311855f8284d28a4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-padaos python3.10dist(padaos) python310-padaos python3dist(padaos)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

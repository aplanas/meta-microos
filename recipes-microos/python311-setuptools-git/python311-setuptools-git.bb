SUMMARY = "Setuptools revision control system plugin for Git"
DESCRIPTION = "This is a plugin for setuptools that enables git integration. Once \
installed, Setuptools can be told to include in a package distribution \
all the files tracked by git. This is an alternative to explicit \
inclusion specifications with MANIFEST.in. \
 \
This package was formerly known as gitlsfiles. The name change is the \
result of an effort by the setuptools plugin developers to provide a \
uniform naming convention."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python311-setuptools-git-1.2-3.8.noarch.rpm"
RPM_HASH = "8bb580677eaa72c02282ab0416fbfff214ba42bbfc90593b0cf6a22c2c1ffe8093adcbdc771e8a888b76502e55da9b2c5d345f79b6ba3198126efce02921fe4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-git) python311-setuptools-git python3dist(setuptools-git)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

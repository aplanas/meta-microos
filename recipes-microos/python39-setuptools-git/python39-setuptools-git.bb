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

RPM_NAME = "python39-setuptools-git-1.2-3.8.noarch.rpm"
RPM_HASH = "79bb44afa37fa7588ba6d57cfa130c6faf8b90db5e53396ebc67b5c88c76fa3349ee65830f2f4b97000ed71798fc3c21a4de9db2b6357c9fcdf46fd16c7367e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(setuptools-git) python39-setuptools-git python3dist(setuptools-git)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

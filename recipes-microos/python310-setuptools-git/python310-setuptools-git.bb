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

RPM_NAME = "python310-setuptools-git-1.2-3.8.noarch.rpm"
RPM_HASH = "a1be5674fe6693ad7c58274ec96a91b7de33885e0f0afa19f93491a4525e06c199cb80fdf0b5d15be8adbcbb9f79668196497793ffc0c8f6ee5d739c24639092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-git python3.10dist(setuptools-git) python310-setuptools-git python3dist(setuptools-git)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

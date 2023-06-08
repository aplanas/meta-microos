SUMMARY = "Python Git Library"
DESCRIPTION = "GitPython is a python library used to interact with Git repositories. \
 \
GitPython provides object model read and write access to your git repository. \
Access repository information conveniently, alter the index directly, handle \
remotes, or go down to low-level object database access with big-files support. \
 \
With the new object database abstraction added in 0.3, its even possible to \
implement your own storage mechanisms, the currently available implementations \
are 'cgit' and pure python, which is the default."
LICENSE = "BSD-3-Clause"

PV = "3.1.30.1672298042.141cd65"

RPM_NAME = "python311-GitPython-3.1.30.1672298042.141cd65-2.1.noarch.rpm"
RPM_HASH = "e3c596b34e9199b9ff49ebee81cc362cb235445167b1f952b4c926110af45507bc298a04965072ffd1e38c290e1a51549fea56a83d936dc44197f6b9190b12b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gitpython) python311-GitPython python3dist(gitpython)"
RDEPENDS:${PN} += "git-core python(abi) python311-gitdb"

inherit rpm

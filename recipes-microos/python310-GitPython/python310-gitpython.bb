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

RPM_NAME = "python310-GitPython-3.1.30.1672298042.141cd65-2.1.noarch.rpm"
RPM_HASH = "6369800394058eb809081ccf6d9fae86e2820b3d080046a64b898917aeb908b3647898d4c2c9c46747fee3f12b3efca025d702ad1aaa56c70a590bd01e7cd9ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GitPython python3.10dist(gitpython) python310-GitPython python3dist(gitpython)"
RDEPENDS:${PN} += "git-core python(abi) python310-gitdb"

inherit rpm

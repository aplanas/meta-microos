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

RPM_NAME = "python39-GitPython-3.1.30.1672298042.141cd65-2.1.noarch.rpm"
RPM_HASH = "e36400550630ef0f60fa0adb69a926f6d1c5203857dd7dede3f972dbcc2f1da7a0fc31d7f849e003a3d922f537f8d31223552baf683c8348c5bbcb506db2ceb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gitpython) python39-GitPython python3dist(gitpython)"
RDEPENDS:${PN} += "git-core python(abi) python39-gitdb"

inherit rpm

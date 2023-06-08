SUMMARY = "Tool to analyze git deps"
DESCRIPTION = "Tool to analyze git dependencies \
 \
file bugs at https://github.com/aspiers/git-deps/issues"
LICENSE = "GPL-2.0-only"

PV = "1.0.2+git.1559732444.7c75531"

RPM_NAME = "git-deps-1.0.2+git.1559732444.7c75531-4.3.noarch.rpm"
RPM_HASH = "930ef4ab640deccad3628d18e2c2b69e6c09f9dbe495bd809015c24ee52223720de139c52b1644a87fe27471e33267d3e42f38925fe73f8b80cd50c109f43430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-deps python3.10dist(git-deps) python3dist(git-deps)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 npm python(abi) python3-Flask python3-pygit2"

inherit rpm

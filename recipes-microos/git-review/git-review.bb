SUMMARY = "Tool to submit code to Gerrit"
DESCRIPTION = "A git command for submitting branches to Gerrit \
 \
git-review is a tool that helps submitting git branches to gerrit for \
review."
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "git-review-2.3.1-1.2.noarch.rpm"
RPM_HASH = "a6125bf6fdce2c8986ca757b0118a39f621f6dd37abb29a7d7805c6628d72ed668baddaf7efd1b3a1c352245a89f6bda1c3c0c185db72eab826dc8b765297f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-review python3-git-review python3.10dist(git-review) python3dist(git-review)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-requests python3-setuptools"

inherit rpm

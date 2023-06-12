SUMMARY = "Tool to submit code to Gerrit"
DESCRIPTION = "A git command for submitting branches to Gerrit \
 \
git-review is a tool that helps submitting git branches to gerrit for \
review."
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "git-review-2.3.1-2.1.noarch.rpm"
RPM_HASH = "edcacb1aa3f0e7171814b49b6dc8a686b4d93f240a92a7f82a06734bc1cd7b6ba637e5741cd253a27c9084ea615529141b84746588a501458be9c833bcca0fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-review \
python3-git-review \
python3.10dist(git-review) \
python3dist(git-review)"
RDEPENDS:${PN} += "/usr/bin/python3.10 \
python(abi) \
python3-requests"

inherit rpm

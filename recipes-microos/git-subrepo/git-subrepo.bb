SUMMARY = "Git Submodule Alternative"
DESCRIPTION = "This git command 'clones' an external git repo into a subdirectory of your \
repo. Later on, upstream changes can be pulled in, and local changes can be \
pushed back. Simple."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "git-subrepo-0.4.5-1.2.noarch.rpm"
RPM_HASH = "618368cbe1ad7d5ee9c91dd52c2f09768d44e20801472bab284087fc014533b70ac3761a357a590662a36b990c09ea60cbe69721279bcf8d535b8cd41be3c7ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-subrepo"
RDEPENDS:${PN} += "/bin/bash bash git-core"

inherit rpm

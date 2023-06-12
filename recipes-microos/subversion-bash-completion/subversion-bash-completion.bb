SUMMARY = "Bash Completion for subversion"
DESCRIPTION = "Bash command line completion support for subversion - completion of subcommands, \
parameters and keywords for the svn command and other tools."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-bash-completion-1.14.2-5.3.noarch.rpm"
RPM_HASH = "0cf16d691481e16edf9f67e85c3b532df370a32159bb0ac05c87e44f39a00382fd30a2cc198659fdbc9e6c99957d6a4538f80275190b1067b3238c12aa51f0eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subversion-bash-completion"
RDEPENDS:${PN} += "bash-completion \
subversion"

inherit rpm

SUMMARY = "Bash Completion for xca"
DESCRIPTION = "Bash completion script for xca."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "xca-bash-completion-2.4.0-2.3.noarch.rpm"
RPM_HASH = "5dde13d2a5f6487b4bbcf7197306b7ec14aca3579c9d80fb11346c78ded856bb1e0fb0fb1f57032ccd90a898477f4eff328e39faac54ce44e86884c24c5fe12c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xca-bash-completion"
RDEPENDS:${PN} += "bash-completion xca"

inherit rpm

SUMMARY = "Bash Completion for patool"
DESCRIPTION = "This package contains bash completion for patool, a portable command line \
archive file manager."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "patool-bash-completion-1.12-2.6.noarch.rpm"
RPM_HASH = "683c77f3b874e264832f5a2e1e2b91149a21db76ed31b0133737c71009b33ac32a3d78ec47048d77403d6ea309bb2b064161ab865df5151172e6d36c5761f9d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "patool-bash-completion"
RDEPENDS:${PN} += "bash-completion patool"

inherit rpm

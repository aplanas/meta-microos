SUMMARY = "Zsh Completion for restic"
DESCRIPTION = "Zsh command line completion support for restic."
LICENSE = "BSD-2-Clause"

PV = "0.15.2"

RPM_NAME = "restic-zsh-completion-0.15.2-1.1.noarch.rpm"
RPM_HASH = "24dbce343d6d06cf936eae771a1bf489709423f14cfdff45963295b4f4f71cb019725f7987470f45e9922d5559a9d2b216c2ed20a9267812e8722463b2a5e6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(restic-zsh-completion) restic-zsh-completion"
RDEPENDS:${PN} += "restic"

inherit rpm

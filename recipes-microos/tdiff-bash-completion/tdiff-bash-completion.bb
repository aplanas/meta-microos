SUMMARY = "Bash Completion for tdiff"
DESCRIPTION = "Bash completion script for tdiff."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.6"

RPM_NAME = "tdiff-bash-completion-0.8.6-1.4.noarch.rpm"
RPM_HASH = "2d0638d1d1a384c4e373d9aad942142967b289f4132b470ad96a96f03e085bc3f1040cb9659b9f97cc91bc2b4d38346836d7dcf096a63b2d1a4709c009ccdee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tdiff-bash-completion"
RDEPENDS:${PN} += "bash-completion \
tdiff"

inherit rpm

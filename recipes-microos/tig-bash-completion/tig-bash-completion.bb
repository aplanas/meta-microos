SUMMARY = "Bash completion for tig"
DESCRIPTION = "Bash command line completion support for tig."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.8"

RPM_NAME = "tig-bash-completion-2.5.8-1.2.noarch.rpm"
RPM_HASH = "9c2d05e85ffb5f03f9673fb4c55b3db855503ea72c630afe3497c149cc528626c9d75fd96255e1e684479f1400c80add6c4324dfe479e359e7367202bdaf7380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tig-bash-completion"
RDEPENDS:${PN} += "bash-completion \
tig"

inherit rpm

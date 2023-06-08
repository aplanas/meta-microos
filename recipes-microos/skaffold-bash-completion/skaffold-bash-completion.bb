SUMMARY = "Bash Completion for skaffold"
DESCRIPTION = "Bash command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "skaffold-bash-completion-2.4.0-1.1.noarch.rpm"
RPM_HASH = "1ecfc8a11b443655fd066237eab63f72305b9ec39a7f621345154f77cdf33b5db96e212f72d2f85f147fc43dcdaac463efd1987ac249bcf87ed7e1f37ba924c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-bash-completion"
RDEPENDS:${PN} += "bash-completion skaffold"

inherit rpm

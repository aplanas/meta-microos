SUMMARY = "zsh completion for GNU parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. \
This subpackage contains the bash completion for Parallel."
LICENSE = "GPL-3.0-or-later"

PV = "20230422"

RPM_NAME = "gnu_parallel-bash-completion-20230422-1.1.noarch.rpm"
RPM_HASH = "caf6ebc94088b423082b46ee130403863957cedb1673341884d8569597072f3f04b1113eeabd13177581c41d333c28b17f048a3bd01825d43ba4b2e0d37f2701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu_parallel-bash-completion"
RDEPENDS:${PN} += "gnu_parallel"

inherit rpm

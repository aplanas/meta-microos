SUMMARY = "Bash Completion for hut"
DESCRIPTION = "The official bash completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-bash-completion-0.3.0-1.2.noarch.rpm"
RPM_HASH = "130fe61a284562df4c56d2d80bc1d68cbafebdab5059298744ff4c81c5dc808b78530865e849d40d94858df4c4b9b93d26d3514cf63a39ecf08ba264436c71ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm

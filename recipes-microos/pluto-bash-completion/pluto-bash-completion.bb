SUMMARY = "Bash Completion for pluto"
DESCRIPTION = "Bash command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.16.4"

RPM_NAME = "pluto-bash-completion-5.16.4-1.1.noarch.rpm"
RPM_HASH = "6e13f171a802fd05665fbed782f1a99ccbbb6031bc167d2df27f7a9370dc66911fd1eeadd39d2c61dbee529ec80068a8303de863454fcfc60b2a4f9645367f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-bash-completion"
RDEPENDS:${PN} += "pluto"

inherit rpm

SUMMARY = "Bash Completion for pluto"
DESCRIPTION = "Bash command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.16.1"

RPM_NAME = "pluto-bash-completion-5.16.1-1.1.noarch.rpm"
RPM_HASH = "9069276af6dace6dd085f060a58e5671a0414dc08fc502de56b57c49bf5a68bea9f9496916fc5f9551262be4720c8e1b33e626b258a8a1c0ad8eb22656960f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-bash-completion"
RDEPENDS:${PN} += "pluto"

inherit rpm

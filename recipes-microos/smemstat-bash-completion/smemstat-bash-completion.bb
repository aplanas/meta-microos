SUMMARY = "Bash Completion for smemstat"
DESCRIPTION = "Bash completion script for smemstat."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.11"

RPM_NAME = "smemstat-bash-completion-0.02.11-1.2.noarch.rpm"
RPM_HASH = "9f74cd75ebc37c6d9a1c2a72e2ddb760822b4556b537c74da98b0fb4cc04c67a1542cb8d958e289933a4be013ff02abd7874991c291d1e7e92b28e1b15765a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "smemstat-bash-completion"
RDEPENDS:${PN} += "bash-completion \
smemstat"

inherit rpm

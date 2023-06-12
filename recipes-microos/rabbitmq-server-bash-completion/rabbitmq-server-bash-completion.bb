SUMMARY = "Bash completion for rabbitmq-server"
DESCRIPTION = "Optional dependency offering bash completion for rabbitmq-server."
LICENSE = "MPL-2.0"

PV = "3.11.3"

RPM_NAME = "rabbitmq-server-bash-completion-3.11.3-1.3.noarch.rpm"
RPM_HASH = "fa2577bf3131a52a4366fb5262142dfb24ff484e675e591243e148641e716650783d05f79493a2b6e7dab9c662454f2fcde6b366df85ea650b41d6f35b505e3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-server-bash-completion"
RDEPENDS:${PN} += "bash-completion \
rabbitmq-server"

inherit rpm

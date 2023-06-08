SUMMARY = "Script to start a toolbox container for system debugging"
DESCRIPTION = "On systems using transactional-update it is not really possible due to \
the read-only root filesystem to install tools to analyze problems in the \
currently running system, a reboot is always required. Which makes it next \
to impossible to debug such problems. toolbox is a small script that launches \
a container to let you bring in your favorite debugging or admin tools in \
such a system. The root filesystem can be found at /media/root."
LICENSE = "Apache-2.0"

PV = "2.3+git20220622.32785f7"

RPM_NAME = "toolbox-2.3+git20220622.32785f7-3.1.noarch.rpm"
RPM_HASH = "da8fde6dc9284ef1031758ca8bac2b156f78729477402b4fa757eec738db36e4eb2177fe765271c8f31fd07d5ecf925702e8fa2e74dd7cccf95a244f4708e394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(toolbox) toolbox"
RDEPENDS:${PN} += "(podman or docker) /bin/bash"

inherit rpm

SUMMARY = "Emulate Docker CLI using podman"
DESCRIPTION = "This package installs a script named docker that emulates the Docker CLI by \
executes podman commands, it also creates links between all Docker CLI man \
pages and podman."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "podman-docker-4.5.0-1.1.noarch.rpm"
RPM_HASH = "012fa97a63a39fe8ab6260e7a1364515d977951c3e5c237baae93c18dc49f3d51e7f4112d86561e308d373770d291eeb785f5c6536b6dc3a75edaf38d531ecd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "podman-docker"
RDEPENDS:${PN} += "/bin/sh podman"

inherit rpm

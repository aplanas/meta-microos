SUMMARY = "Fish Completion for melange"
DESCRIPTION = "Fish command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-fish-completion-0.3.2-1.1.noarch.rpm"
RPM_HASH = "8ff0b957eed0db72331de0d725724f8db3e84d54e892fa6f9cf5e17b5b95ab220852afab08d3538a69f0e1d4ce8624400947f57d41cad08e5846346690a7c0fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-fish-completion"
RDEPENDS:${PN} += "melange"

inherit rpm

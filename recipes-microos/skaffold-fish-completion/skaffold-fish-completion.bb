SUMMARY = "Fish Completion for skaffold"
DESCRIPTION = "Fish command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "skaffold-fish-completion-2.4.0-1.1.noarch.rpm"
RPM_HASH = "488f03249315f38032113ff8913a0fa5f42c369adcc8e9cf82ba71ef475e8799d35a50b5502160576015eb4caf2972468eaab38af07b335bd8565c9e678dc5f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-fish-completion"
RDEPENDS:${PN} += "skaffold"

inherit rpm

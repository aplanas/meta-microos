SUMMARY = "Fish Completion for nova"
DESCRIPTION = "Fish command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.6.2"

RPM_NAME = "nova-fish-completion-3.6.2-2.1.noarch.rpm"
RPM_HASH = "a7c2da9fb542c765673bd48e9eba8ae3df375361ecb8324ffcb438c438ac7f148209d73d71d72bad532ca8f524b2da59f94e6b8c44b7ce5a422605fa2e7380ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-fish-completion"
RDEPENDS:${PN} += "nova"

inherit rpm

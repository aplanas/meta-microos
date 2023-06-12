SUMMARY = "Fish Completion for yq"
DESCRIPTION = "Fish command line completion support for yq."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-fish-completion-4.33.3-1.2.noarch.rpm"
RPM_HASH = "6756c586a47ac62538ca6af33c79c9bd5bdd6058debba989376c639354d232f5373c9af226b7a4d5c312ef6d26007543d63db6170fe7631c412cc9bfafe111d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-fish-completion"
RDEPENDS:${PN} += "yq"

inherit rpm

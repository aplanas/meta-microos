SUMMARY = "Fish Completion for yq"
DESCRIPTION = "Fish command line completion support for yq."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-fish-completion-4.33.3-1.1.noarch.rpm"
RPM_HASH = "c56fb1eb4a9e5cb42483118d6d7afd7f72f273ee6a5cf8cc3ec2f7073df89df958602c16e3407e3add797075e355154cd7853d86de4234be0368a993ba0d06b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-fish-completion"
RDEPENDS:${PN} += "yq"

inherit rpm

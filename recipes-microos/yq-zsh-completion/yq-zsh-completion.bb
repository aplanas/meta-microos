SUMMARY = "Zsh Completion for yq"
DESCRIPTION = "Zsh command line completion support for yq."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-zsh-completion-4.33.3-1.1.noarch.rpm"
RPM_HASH = "ed845241f74d0d4608ddae290a28eacb6ddb56838e8b3fd9006143fc06afd6271fbe830087c0231131e57a3f23009540ce9d49cc3867658706040848309d2a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-zsh-completion"
RDEPENDS:${PN} += "yq"

inherit rpm

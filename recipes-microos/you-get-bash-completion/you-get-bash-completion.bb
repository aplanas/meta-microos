SUMMARY = "Bash completion for you-get"
DESCRIPTION = "Bash command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-bash-completion-0.4.1650-1.3.noarch.rpm"
RPM_HASH = "bd9b606619e41656b5032d77ff2576b67746d65f1ef339dfa336eec7ea0b27fe33377ea8a0785928384995170c989b3464c7f75916a462e205fccb308588dd84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm

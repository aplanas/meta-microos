SUMMARY = "Bash Completion for nova"
DESCRIPTION = "Bash command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.6.5"

RPM_NAME = "nova-bash-completion-3.6.5-1.1.noarch.rpm"
RPM_HASH = "b0d72d15b6193f77e298477528b8f305c16bf7bda446c605dd2305cafe890381426feb7db229fdacdd7cf4e5d3b9664476fc819e91fde490b7a6419bad9ab0c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-bash-completion"
RDEPENDS:${PN} += "bash-completion nova"

inherit rpm

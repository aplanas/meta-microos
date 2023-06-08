SUMMARY = "Bash Completion for nova"
DESCRIPTION = "Bash command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.6.2"

RPM_NAME = "nova-bash-completion-3.6.2-2.1.noarch.rpm"
RPM_HASH = "8185908d56fb1bae38c1073ce8b6a27f316d97aa058fd37da125ae9aa29ded7bab8d35b62841499305fb01cecec7824283702f0fb24d4a840e9693730bf1b554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-bash-completion"
RDEPENDS:${PN} += "bash-completion nova"

inherit rpm

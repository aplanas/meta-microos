SUMMARY = "Bash completion for you-get"
DESCRIPTION = "Bash command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-bash-completion-0.4.1650-1.2.noarch.rpm"
RPM_HASH = "17224a7c667208038c1ecf01c218275f265d6a6438f63d91cf81570498acaa4342123d69accfce13e8bf0882ddfd346184a139044c563bd50bcc7dbaafc1caa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm

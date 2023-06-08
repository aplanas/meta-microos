SUMMARY = "Bash completion for gmic"
DESCRIPTION = "This package contains the bash completion command for gmic."
LICENSE = "CECILL-2.1"

PV = "3.2.3"

RPM_NAME = "gmic-bash-completion-3.2.3-2.1.noarch.rpm"
RPM_HASH = "0306d475994215edbeb26358672c3747c79409f44ec7a67026b662b83288d07f035afb99184da4bb3407f2fb9e93dc90e293ec39dd32d67d9f45f4dc525abad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmic-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm

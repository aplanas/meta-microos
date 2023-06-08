SUMMARY = "Bash Completion for kubeaudit"
DESCRIPTION = "Bash command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-bash-completion-0.22.0-1.1.noarch.rpm"
RPM_HASH = "8ecf58162dabbdf28312d617c4d73306f5e5c6cdc1e148e0303dd63985d63b8ffd6977abf902ab0146aaf144f04c3b826ea751edc3b41a28749a666685cefce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-bash-completion"
RDEPENDS:${PN} += "bash-completion kubeaudit"

inherit rpm

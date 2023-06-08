SUMMARY = "Bash completion for perf"
DESCRIPTION = "bash command line completion support for perf."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "perf-bash-completion-6.3.1-79.18.aarch64.rpm"
RPM_HASH = "df78a99723deeab66a762776481ea70502293ed642db036676ee3d449754cf7a52118c63fb6e08ad2d05cb4efc3ab5fe1beefc67f8fd633aa546c0d18fe3d60e"

RPROVIDES:${PN} += "perf-bash-completion perf-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion perf"

inherit rpm

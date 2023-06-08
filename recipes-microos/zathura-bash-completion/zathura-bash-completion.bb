SUMMARY = "Zathura Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for zathura"
LICENSE = "Zlib"

PV = "0.5.2"

RPM_NAME = "zathura-bash-completion-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "a0fe90b08e0071636aeb552c0f1e5b5ff04bc484768dc894f31f3f8825057684d2e0b11c8adfeb5541ef034df0aafa688a72dbe8ebbc0e07bf3ac509396117d6"

RPROVIDES:${PN} += "zathura-bash-completion zathura-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion zathura"

inherit rpm

SUMMARY = "Bash completion for tpm2-tss-engine"
DESCRIPTION = "Optional dependency offering bash completion for the tpm2-tss-engine project."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "tpm2-tss-engine-bash-completion-1.2.0-1.2.noarch.rpm"
RPM_HASH = "4ff6362b79a41a185f2e18f7c4043a0adc079ce4b13d9df04970d86353bd4cfd0c51a2000258ffcfb56628757fd6991bfa81e171508ece1e126b9bbf0c986a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tpm2-tss-engine-bash-completion"
RDEPENDS:${PN} += "bash-completion tpm2-tss-engine"

inherit rpm

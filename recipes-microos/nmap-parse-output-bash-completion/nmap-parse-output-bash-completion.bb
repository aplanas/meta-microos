SUMMARY = "Bash Completion for nmap-parse-output"
DESCRIPTION = "Bash completion script for nmap-parse-output."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "nmap-parse-output-bash-completion-1.5.1-2.9.noarch.rpm"
RPM_HASH = "be26cb122e719a1bf0337c402e34d1c0570f33d866ade75f929474959ce019a5cc10483cb081cb40603cc49fd322e04163a333918043df4cf17ed19223bef800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nmap-parse-output-bash-completion"
RDEPENDS:${PN} += "bash-completion nmap-parse-output"

inherit rpm

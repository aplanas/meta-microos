SUMMARY = "Bash completion for highlight"
DESCRIPTION = "This package provides Bash command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.5"

RPM_NAME = "highlight-bash-completion-4.5-1.3.noarch.rpm"
RPM_HASH = "4674155f6bedcc10708f1f455cf9bb511dfdb838279b28c1d3f319f1089a8d651255fa76e78b078ff25ca6c8514a324a98ca77cae0bd4e2c12c2f0594259d36d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-bash-completion"
RDEPENDS:${PN} += "bash-completion highlight"

inherit rpm

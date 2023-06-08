SUMMARY = "Bash completion for wl-clipboard"
DESCRIPTION = "Bash command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "wl-clipboard-bash-completion-2.1.0-1.6.noarch.rpm"
RPM_HASH = "bae5a0d8ec0aa1a64ee29a0056a1eb99dd478d6c5ee2647ef5fd7c34360e25b724463523d4226d56bde589c8818d20df36749e156435b865003305464dfecb79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-bash-completion"
RDEPENDS:${PN} += "wl-clipboard"

inherit rpm

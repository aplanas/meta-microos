SUMMARY = "Bash completion for skopeo"
DESCRIPTION = "This package contains the bash completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "skopeo-bash-completion-1.11.1-1.3.noarch.rpm"
RPM_HASH = "204891d3196e91f507172b0d9a815a786fc58c968ca1ae60cdaacaffb87f9b5fed7b2dbc10caa5e43bebf08faa988c0636003319fd5fdc4caeb50701c6d96d4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-bash-completion"
RDEPENDS:${PN} += "bash-completion skopeo"

inherit rpm

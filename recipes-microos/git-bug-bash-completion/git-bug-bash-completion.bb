SUMMARY = "Bash completion for git-bug"
DESCRIPTION = "Bash shell completions for git-bug"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "git-bug-bash-completion-0.8.0-1.3.noarch.rpm"
RPM_HASH = "854f77bc96ac04527849a1b278156e877b270dff79c74730b9edea6ba6e5a972263fd7575b431844e5c17597689c114f6ca8a2a05ae46863e248fa8182bd0e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-bug-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm

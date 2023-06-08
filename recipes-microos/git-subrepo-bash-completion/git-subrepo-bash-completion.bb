SUMMARY = "Bash completion for git-subrepo"
DESCRIPTION = "Bash shell completions for git-subrepo"
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "git-subrepo-bash-completion-0.4.5-1.2.noarch.rpm"
RPM_HASH = "df5efbfd8b713b296a58471031180a0e664b30f0fe2e2fa5efc2067138105274169461103c2b2304510134153fc566cf861d989e720705bd479eae389930fe8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-subrepo-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm

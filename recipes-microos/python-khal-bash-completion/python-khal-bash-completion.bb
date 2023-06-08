SUMMARY = "Bash completion for khal"
DESCRIPTION = "Bash shell completions for khal"
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python-khal-bash-completion-0.10.5-3.4.noarch.rpm"
RPM_HASH = "d11cd0c0abaf2da70c7f129ec0fb2b61f6094dad54bc4f48276e1fec8ec0a5971b13d2b8d11eea71babbc2fcde40b8e71ad42d87630cd8b2d39298f8f2749c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-khal-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm

SUMMARY = "Bash Completion for lxc"
DESCRIPTION = "Bash command line completion support for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.1"

RPM_NAME = "lxc-bash-completion-5.0.1-2.3.noarch.rpm"
RPM_HASH = "00a21c0b6ffa13f74ea12fe290c62d6cc8c423fd24e5ccf7ffadbf19841b75ed70b50ee8010d4b010bc4fbc13441d7b091fcabbbbb4b7ccf1dd9e45e90b15b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-bash-completion"
RDEPENDS:${PN} += "lxc"

inherit rpm

SUMMARY = "Bash Completion for mpv"
DESCRIPTION = "Bash command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.35.1+git.20230315.e1727553"

RPM_NAME = "mpv-bash-completion-0.35.1+git.20230315.e1727553-1.4.noarch.rpm"
RPM_HASH = "6fc0a39ac4ea8d7e791394acbe6c658911b1b38726fa2415e3fabb294e17636b81fca05df2ff1047dc3136a4cd9904d04f986773a6a92ddb0b18e26046cf7a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-bash-completion"
RDEPENDS:${PN} += "bash-completion mpv"

inherit rpm

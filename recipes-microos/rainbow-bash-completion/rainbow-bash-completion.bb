SUMMARY = "Bash Completion for rainbow"
DESCRIPTION = "Bash completion script for rainbow."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "rainbow-bash-completion-2.8.0-1.4.noarch.rpm"
RPM_HASH = "92343e16075f48a9fe1661516e62f4f2c40aaba3b46a4e1fd14b7af07d540335373879b9d4931e09028e60c28064eae3844f7257b9ac252e5a5ab8dc13a294f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rainbow-bash-completion"
RDEPENDS:${PN} += "bash-completion \
rainbow"

inherit rpm

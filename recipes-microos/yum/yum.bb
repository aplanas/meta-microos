SUMMARY = "As a Yum CLI compatibility layer, supplies /usr/bin/yum redirecting to DNF"
DESCRIPTION = "As a Yum CLI compatibility layer, it supplies /usr/bin/yum redirecting to DNF."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "yum-4.14.0-3.1.noarch.rpm"
RPM_HASH = "f7d99d0b81668a726ad8aceace4a37eaa6c432fec1dbed49336a00018bd01042de30cb14662334fe873406694a5699e9764fa3e456951c821d6c88d5c198e21c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(yum) dnf-yum yum yum-aliases yum-allowdowngrade yum-basearchonly yum-downloadonly yum-fastestmirror yum-priorities yum-protect-packages yum-protectbase yum-refresh-updatesd yum-tsflags"
RDEPENDS:${PN} += "dnf"

inherit rpm

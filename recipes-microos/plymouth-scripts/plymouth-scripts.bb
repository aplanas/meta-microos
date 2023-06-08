SUMMARY = "Plymouth related scripts"
DESCRIPTION = "This package contains scripts that help integrate Plymouth with \
the system."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-scripts-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "9607ea2f45e0765258ec6cfdf716a4c90b347117ad1a8dceab6850f828f05dae3f7dd1b5b6bf7a564c5a9e1489b9b2e2df7b075d2d14219f8e255f716cc0fd6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-scripts"
RDEPENDS:${PN} += "/bin/bash awk dracut grep plymouth sed"

inherit rpm

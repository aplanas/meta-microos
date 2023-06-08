SUMMARY = "A RGB/HSV color selector"
DESCRIPTION = "A simple interactive RGB/HSV color selector modelled after Gimp2 RGB/HSV color \
selector."
LICENSE = "SUSE-Public-Domain"

PV = "20110107"

RPM_NAME = "vim-plugin-colorsel-20110107-55.1.noarch.rpm"
RPM_HASH = "67e11ad0fc9027992f4a1b465956df33f18ec4d4c013a698e83a397cc78edf0813059be60b55fd956660a68764d33e1108b3556ccbe08361f9ea44684a1cc32f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-colorsel"
RDEPENDS:${PN} += "/bin/sh gvim vim"

inherit rpm

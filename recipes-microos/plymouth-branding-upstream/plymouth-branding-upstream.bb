SUMMARY = "Default configuration file and branding from the Plymouth upstream"
DESCRIPTION = "This package contains the /usr/share/plymouthd.defaults which contains the basic \
settings and branding from the upstream."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-branding-upstream-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "afa085c539c854f7198ec96c470311a925c3d7c62ab5393438ef39837bf401fb2d82cf82e54d16fa279169e30691e3fd5ac02dcd7b8f54060092e6ac42a824f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-branding plymouth-branding-upstream"
RDEPENDS:${PN} += ""

inherit rpm

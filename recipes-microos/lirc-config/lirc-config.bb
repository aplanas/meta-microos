SUMMARY = "LIRC Configuration Tools and Data"
DESCRIPTION = "The LIRC config package contains tools and data  to ease the \
LIRC configuration process."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-config-0.10.1-10.1.noarch.rpm"
RPM_HASH = "b33b86d28df29e23c8ac26a8cc26eebfbd3dff597924373e098f35c72649fd8c5d8d55c4d9c516e146d75fee2fdcf95c5d92324210c7d64bfeeb36e65df386ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lirc-config lirc-remotes"
RDEPENDS:${PN} += "lirc-core python3-PyYAML python3-gobject"

inherit rpm

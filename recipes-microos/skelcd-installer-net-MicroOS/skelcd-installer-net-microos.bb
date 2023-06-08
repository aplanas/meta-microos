SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "skelcd-installer-net-MicroOS-17.86-1.29.aarch64.rpm"
RPM_HASH = "a2006f478bbf52562a4b5a8e2b8df8f200fbef501494550654430876c99ca7cb9900578af332abd605f5d5d9c6b255745127adbc3857ba06538d468ea84abebe"

RPROVIDES:${PN} += "skelcd-installer skelcd-installer-net-MicroOS skelcd-installer-net-MicroOS(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

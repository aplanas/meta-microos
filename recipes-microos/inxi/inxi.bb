SUMMARY = "A system information script"
DESCRIPTION = "inxi is a command line system information tool. It was forked from \
infobash. The primary purpose of inxi is for support, and sys admin \
use. inxi is used widely for forum and IRC support."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.23"

RPM_NAME = "inxi-3.3.23-1.2.noarch.rpm"
RPM_HASH = "f4c650b0269c0da6239a2352e8172e1db134d56f99f6ad5f5aa7da6aaf15b935c60d4919881fc814d060dcd64fb59b50eba91ca9d21aae84e609fd1b55eb42e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inxi"
RDEPENDS:${PN} += "/usr/bin/perl pciutils procps util-linux"

inherit rpm

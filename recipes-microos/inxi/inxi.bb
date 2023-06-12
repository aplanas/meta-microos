SUMMARY = "A system information script"
DESCRIPTION = "inxi is a command line system information tool. It was forked from \
infobash. The primary purpose of inxi is for support, and sys admin \
use. inxi is used widely for forum and IRC support."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.27"

RPM_NAME = "inxi-3.3.27-1.1.noarch.rpm"
RPM_HASH = "2cab92de6d1024583847142f7e0ccf0cdc075aa2febbc8e8297b422c9f409d33f3e74ca7638cc45f9a7ce5ec84db30ee688d25234c53164f3307c235a726df8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inxi"
RDEPENDS:${PN} += "/usr/bin/perl pciutils procps util-linux"

inherit rpm

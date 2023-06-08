SUMMARY = "SSH library configuration files"
DESCRIPTION = "Configuration files for the SSH library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libssh-config-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "e4af41ca4a3aaedadd321493586b998aee9786df6a252929e3ee910f696acabe67afa0441a144979f6cd90d412713b3e970e27bd97038394edaef8f3a3a076f0"

RPROVIDES:${PN} += "config(libssh-config) libssh-config libssh-config(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

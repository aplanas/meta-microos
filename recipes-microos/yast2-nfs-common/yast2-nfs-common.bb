SUMMARY = "Configuration of NFS, common parts"
DESCRIPTION = "Common data for the NFS client and server modules"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-nfs-common-4.6.0-1.1.noarch.rpm"
RPM_HASH = "6c1790d21f7cb11db0fccc6d3fe5621283443fe5068b12d3e792a0666d9b82de27484af10ae1a5c3de3c08fedc6f15ee5ceba1a049cedcd42a511f0a0104e262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-nfs-common"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Supportconfig Analysis Appliance Common Files"
DESCRIPTION = "Provides the common files needed by both the SCA Broker, Agent and pattern development."
LICENSE = "GPL-2.0-only"

PV = "1.3"

RPM_NAME = "sca-appliance-common-1.3-2.10.noarch.rpm"
RPM_HASH = "74b70753d40bfb6c6c94ec25dc1d54daa24b4b7962db22a9770894a30fb21048948c3c3a7a073b21c15d2aad438c8741048e309d15b2a49b7290e5ceab8c9d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-appliance-common"
RDEPENDS:${PN} += "/bin/logger /bin/ping /usr/bin/awk /usr/bin/dos2unix /usr/bin/sed /usr/bin/ssh /usr/bin/vmstat /usr/sbin/mysqld apache2 curl"

inherit rpm

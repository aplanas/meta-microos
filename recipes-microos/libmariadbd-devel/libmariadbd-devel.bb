SUMMARY = "MariaDB embedded server development files"
DESCRIPTION = "This package contains the development header files and libraries \
for developing applications that embed the MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.2"

RPM_NAME = "libmariadbd-devel-10.11.2-2.3.aarch64.rpm"
RPM_HASH = "356d4e902f6dfb5aaa212528052784d0179b99fe293080c72445e94be2352f420ffef98faa027e623b2b5fd457d3a208eddd05a889d633670d3b4850b381de5a"

RPROVIDES:${PN} += "libmariadbd-devel libmariadbd-devel(aarch-64) libmysqld-devel"
RDEPENDS:${PN} += "libaio-devel libmariadb-devel libmariadbd19 tcpd-devel"

inherit rpm

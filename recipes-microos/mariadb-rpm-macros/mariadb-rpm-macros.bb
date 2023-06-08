SUMMARY = "MariaDB RPM macros"
DESCRIPTION = "Provides macros usable in rpm spec files."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.2"

RPM_NAME = "mariadb-rpm-macros-10.11.2-2.3.aarch64.rpm"
RPM_HASH = "0b3d60a831c2fec24aa3d76e86fcf049b6ed72c2ddf9e87361d7a1e06a8b7b74010ec55b20d39399a4efbcc4c52ff700bd49dec9f7ff4186f6866242af2f9862"

RPROVIDES:${PN} += "mariadb-rpm-macros mariadb-rpm-macros(aarch-64) rpm_macro(mysql_testserver_cconf) rpm_macro(mysql_testserver_start) rpm_macro(mysql_testserver_stop)"
RDEPENDS:${PN} += "mariadb"

inherit rpm

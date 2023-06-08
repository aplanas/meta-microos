SUMMARY = "AppArmor"
DESCRIPTION = "The 32bit pattern complementing apparmor."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-apparmor-32bit-20200505-40.1.aarch64.rpm"
RPM_HASH = "1f7f3321005521f1fd6a169c7d38d45c04ab4b80b107e116685ed642aed3737c033ded30039fc3cbeb85bf06b26f665ecf8092a9d8284e81ee1570112c8e3144"

RPROVIDES:${PN} += "pattern() patterns-base-apparmor-32bit patterns-base-apparmor-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

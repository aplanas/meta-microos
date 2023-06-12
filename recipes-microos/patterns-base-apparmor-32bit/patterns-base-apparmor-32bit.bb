SUMMARY = "AppArmor"
DESCRIPTION = "The 32bit pattern complementing apparmor."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-apparmor-32bit-20200505-41.1.aarch64.rpm"
RPM_HASH = "7155ddfca2b30ac721073c1f158a50e253e6e88716b702be084b5fe4de8d71cdaea18cfa467ce00fdf0e59853f3cffe97bb685eca1521bf67f8fa816a3a37a10"

RPROVIDES:${PN} += "pattern() patterns-base-apparmor-32bit patterns-base-apparmor-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Base System"
DESCRIPTION = "The 32bit pattern complementing base."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-base-32bit-20200505-40.1.aarch64.rpm"
RPM_HASH = "b1eac4ba66d6ae923530510cf60f9c82449072930cf0099c369ecfcb3ff9ebebcc5994340021b86a67293b243ff9ae8af6040286fe478dbfddfb026ad4e9f99e"

RPROVIDES:${PN} += "pattern() patterns-base-base-32bit patterns-base-base-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

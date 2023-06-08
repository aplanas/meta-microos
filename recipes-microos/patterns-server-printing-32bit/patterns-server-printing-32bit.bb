SUMMARY = "Print Server"
DESCRIPTION = "The 32bit pattern complementing printing."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-printing-32bit-20210330-4.1.aarch64.rpm"
RPM_HASH = "bad2322a224892ce65cea7fd7d4fd70982a12200d41fab7a52068202075c72edba858af41615561bc7b31fab6cb04f6646293e2d3e2aca42a271f5517617f660"

RPROVIDES:${PN} += "pattern() patterns-server-printing-32bit patterns-server-printing-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Mail and News Server"
DESCRIPTION = "The 32bit pattern complementing mail_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-mail_server-32bit-20210330-4.1.aarch64.rpm"
RPM_HASH = "f87664dc44f46c517b6d76c52f6a87442154543986539ccc2bd08457393db9728a06577abac9d4d02622bef886e74dba4a6d8589652536348fc0e23441a29a95"

RPROVIDES:${PN} += "pattern() patterns-server-mail_server-32bit patterns-server-mail_server-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

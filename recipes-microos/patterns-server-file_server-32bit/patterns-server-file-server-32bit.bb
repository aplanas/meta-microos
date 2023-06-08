SUMMARY = "File Server"
DESCRIPTION = "The 32bit pattern complementing file_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-file_server-32bit-20210330-4.1.aarch64.rpm"
RPM_HASH = "8085df4bbcf9d19edcfd9802f54f5dcd058381fd3ce002a88b62292c337e6aae8abca7c476fcc9b6439d5fa1e07851bc582ee52d951c3b7f4d608187f704d294"

RPROVIDES:${PN} += "pattern() patterns-server-file_server-32bit patterns-server-file_server-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

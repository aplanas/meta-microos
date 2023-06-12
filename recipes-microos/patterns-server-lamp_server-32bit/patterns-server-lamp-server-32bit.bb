SUMMARY = "Web and LAMP Server"
DESCRIPTION = "The 32bit pattern complementing lamp_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-lamp_server-32bit-20210330-5.1.aarch64.rpm"
RPM_HASH = "56f50ebee22e570fc0a8300739418925094f50c61a44cac4450a0db0c28c0d8f34d734bd54cf92ab0ee37c4ebd023c11bc81009ad7218df108d6a32a54b5e3a7"

RPROVIDES:${PN} += "pattern() patterns-server-lamp_server-32bit patterns-server-lamp_server-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

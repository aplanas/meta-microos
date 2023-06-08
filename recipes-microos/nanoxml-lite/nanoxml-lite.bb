SUMMARY = "Lite version of nanoxml"
DESCRIPTION = "NanoXML/Lite is the successor of NanoXML 1.x. It is still small (only \
6KB) and features a much faster algorithm. It is recommended if you \
are currently using NanoXML 1.x and do not want to adapt your code \
for the new API or if you are coding applications that have to be \
very small (like applets or embedded code). Please note that \
NanoXML/Lite has only limited functionality (no mixed content, DTD is \
ignored...)."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-lite-2.2.3-4.6.noarch.rpm"
RPM_HASH = "472d18e760e6ebcc4150e781280dc2dabe8b772790b46bc7d092530c9f9c8a6541a3ccd1888dedda6a2ffecb7c7549857efd2092ce2480cb3d38808e46e7419b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-lite"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "A Python HTTP client library"
DESCRIPTION = "A comprehensive HTTP client library that supports many features \
left out of other HTTP libraries."
LICENSE = "Apache-2.0 & MIT & (GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later)"

PV = "0.22.0"

RPM_NAME = "python311-httplib2-0.22.0-1.2.noarch.rpm"
RPM_HASH = "b954066fe807d528aeaa7fa1e91ecdcf69c03ad564ddf02dee4fd5412d40bf71dcf37e08c10a3b0ece7857222232c9ab8d7b4a4eb749e939c473b677abfa89d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(httplib2) \
python311-httplib2 \
python3dist(httplib2)"
RDEPENDS:${PN} += "ca-certificates \
python(abi) \
python311-certifi \
python311-pyparsing"

inherit rpm

SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "WTFPL"

PV = "2.1.0"

RPM_NAME = "python311-wakeonlan-2.1.0-1.11.noarch.rpm"
RPM_HASH = "e873b5ea9147e8e5c1c0cb24d18b6182f3ba5c75c9d0d7c7d62f8e168206f7d4e9954b88139389a636761088e81c221ae2bbb553540222f270b9ee396509a7e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wakeonlan) python311-wakeonlan python3dist(wakeonlan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm

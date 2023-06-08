SUMMARY = "Manual pages for the hxtools suite"
DESCRIPTION = "This package contains the manual pages for the binaries and scripts \
from hxtools."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "hxtools-man-20230411-1.1.noarch.rpm"
RPM_HASH = "ddd0e92b3795b6086edd750eb7e9d430979e6c2b1beddb17e5d8d98f9d8f9db9623f80225345ab635de4d7f99157a0e8999153967f61a91f29649661e3eb1808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hxtools-man"
RDEPENDS:${PN} += ""

inherit rpm

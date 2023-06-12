SUMMARY = "RPC protocol definitions"
DESCRIPTION = "The rpcsvc-proto package includes several rpcsvc header files \
and RPC protocol definitions from SunRPC sources (as shipped with \
glibc)."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "rpcsvc-proto-devel-1.4.4-1.1.aarch64.rpm"
RPM_HASH = "7d398878da63ae76903c4cd538b4273d62167a4314305db9b60065a5f8d4ef741815a7c1b325fbc9d7304f3d2d0d2d7900536e7db8c4b3508a025be0e8f8a5ff"

RPROVIDES:${PN} += "rpcsvc-proto-devel \
rpcsvc-proto-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

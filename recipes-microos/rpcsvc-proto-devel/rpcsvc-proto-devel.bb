SUMMARY = "RPC protocol definitions"
DESCRIPTION = "The rpcsvc-proto package includes several rpcsvc header files \
and RPC protocol definitions from SunRPC sources (as shipped with \
glibc)."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "rpcsvc-proto-devel-1.4.3-1.4.aarch64.rpm"
RPM_HASH = "397cdc7681cc79a5bb919b90af2310d752410a10e427a74f9ec24c38038fb5d34bd98d40381b51fc26fdc88bec98eddd4ca04a2c777d0962037cf48070993d54"

RPROVIDES:${PN} += "rpcsvc-proto-devel rpcsvc-proto-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

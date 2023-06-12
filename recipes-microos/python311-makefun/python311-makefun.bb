SUMMARY = "Small library to dynamically create python functions"
DESCRIPTION = "Small library to dynamically create python functions."
LICENSE = "BSD-3-Clause"

PV = "1.15.1"

RPM_NAME = "python311-makefun-1.15.1-2.2.noarch.rpm"
RPM_HASH = "64e11ae627f609d30336f4b1313a9676f56904cca1da55d6b5e9c9275d822e56d9a6c0c82efe1be67c73b151712b2ce7af492791409f974b5bfa43ca63228031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(makefun) \
python311-makefun \
python3dist(makefun)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

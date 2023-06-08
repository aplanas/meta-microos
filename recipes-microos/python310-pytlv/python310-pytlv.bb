SUMMARY = "TLV(tag length value) data parser"
DESCRIPTION = "TLV (tag length value) data parser, especially useful for EMV tag parsing."
LICENSE = "LGPL-2.0-only"

PV = "0.71"

RPM_NAME = "python310-pytlv-0.71-1.16.noarch.rpm"
RPM_HASH = "88ee8ece8ae9a00232691754e94ac051b146623f3a3c47977c5dc10b9bb25e22a31c3627e5ea33f0bc8bbb5c47846c97950346355864586c9e5b3e272d81e332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytlv python3.10dist(pytlv) python310-pytlv python3dist(pytlv)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

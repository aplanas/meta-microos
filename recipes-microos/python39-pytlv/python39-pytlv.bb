SUMMARY = "TLV(tag length value) data parser"
DESCRIPTION = "TLV (tag length value) data parser, especially useful for EMV tag parsing."
LICENSE = "LGPL-2.0-only"

PV = "0.71"

RPM_NAME = "python39-pytlv-0.71-1.16.noarch.rpm"
RPM_HASH = "43d2e21ba0b245dababe5d17b84147fc02725c46e06ac421bb04d6e43ce93d250a8ba1d87b522273056d60f6fc4fa8c67e7c36b2064bddcb951bcd2557631d3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytlv) \
python39-pytlv \
python3dist(pytlv)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

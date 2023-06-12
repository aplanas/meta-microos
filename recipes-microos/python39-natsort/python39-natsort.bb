SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python39-natsort-8.2.0-1.4.noarch.rpm"
RPM_HASH = "3d94136d01d22003260d90751e078e6ffe8ed6ebb11a25445d55429b849ef005b4616310e5a04b40e129e63ae5ad1dddf025b7a7e2fee9bfb2da729d0187f39c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(natsort) \
python39-natsort \
python3dist(natsort)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm

SUMMARY = "Generator for network diagram images from text"
DESCRIPTION = "nwdiag generates network diagram images from text."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-nwdiag-3.0.0-1.5.noarch.rpm"
RPM_HASH = "10ac81ffb1b48020fa246fae32bd12091aab2b5d1cf9ddf9c9255a7f8866d1a0401335637591b81c5367798a5a65d46fd77162cad0e094e07c9ec97326268111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nwdiag) python311-nwdiag python3dist(nwdiag)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-blockdiag python311-setuptools update-alternatives"

inherit rpm

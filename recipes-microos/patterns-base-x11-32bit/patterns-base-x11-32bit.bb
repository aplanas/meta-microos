SUMMARY = "X Window System"
DESCRIPTION = "The 32bit pattern complementing x11."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11-32bit-20200505-40.1.aarch64.rpm"
RPM_HASH = "10b070e5cbe61a660ae0282b6e7a239683a9dddff124156724b0860bf98d1513b3051fa133396137dbac8b6235f7c1c9da54866596f794438e4725b5248361f0"

RPROVIDES:${PN} += "pattern() patterns-base-x11-32bit patterns-base-x11-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

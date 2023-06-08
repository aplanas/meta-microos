SUMMARY = "Linux Kernel Development"
DESCRIPTION = "The 32bit pattern complementing devel_kernel."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_kernel-32bit-20170319-11.2.aarch64.rpm"
RPM_HASH = "204cb97e71c101edb365c2a3ec7506a5c027f4e0b02265118fe36d01ee03d3082602d0007e00afad491ae08d6cd3e2bebb260c526525b5497535f96ce12f21e5"

RPROVIDES:${PN} += "pattern() patterns-devel-base-devel_kernel-32bit patterns-devel-base-devel_kernel-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

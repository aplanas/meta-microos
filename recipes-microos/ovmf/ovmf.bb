SUMMARY = "Open Virtual Machine Firmware"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base."
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "ovmf-202302-2.2.aarch64.rpm"
RPM_HASH = "69b6e09a6e6cd414336b1ea2609f41af7d3e394665967a992d5a70fcc273b8ed9aa1cf63e8e31772f1f772a6c69b8bf859ab8f5d87b47e920bfac0228f4ce47c"

RPROVIDES:${PN} += "ovmf ovmf(aarch-64)"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm

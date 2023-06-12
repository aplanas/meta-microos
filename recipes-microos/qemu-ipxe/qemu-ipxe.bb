SUMMARY = "PXE ROMs for QEMU NICs"
DESCRIPTION = "Provides Preboot Execution Environment (PXE) ROM support for various emulated \
network adapters available with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.0.0+"

RPM_NAME = "qemu-ipxe-1.0.0+-1.1.noarch.rpm"
RPM_HASH = "f04698e5ef4d6a005fa8a45df2e03cffb7e356cce22fe4f97007350500ae99abd3820c9c370a5ee2e1194c26a33690ed98f29626a5e8b914312dd642f8a53c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ipxe"
RDEPENDS:${PN} += ""

inherit rpm

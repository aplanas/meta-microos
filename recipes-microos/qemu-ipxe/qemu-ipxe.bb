SUMMARY = "PXE ROMs for QEMU NICs"
DESCRIPTION = "Provides Preboot Execution Environment (PXE) ROM support for various emulated \
network adapters available with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.0.0+"

RPM_NAME = "qemu-ipxe-1.0.0+-16.1.noarch.rpm"
RPM_HASH = "87d1781c00f4249ca6c31a38ffb7c0ea439c4b15ce2250b17451536362c4b0658166b26517613f9fe5670caa7c36a49daed08b9ef6e46aa0dbe57407fd3a3b93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ipxe"
RDEPENDS:${PN} += ""

inherit rpm

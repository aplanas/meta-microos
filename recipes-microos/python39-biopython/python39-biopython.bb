SUMMARY = "Python Tools for Computational Molecular Biology"
DESCRIPTION = "The Biopython Project is an international association of developers of freely \
available Python tools for computational molecular biology."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.81"

RPM_NAME = "python39-biopython-1.81-1.5.aarch64.rpm"
RPM_HASH = "deba9078c3d6c136f45b9432b57a63e500c4cd5f325bab093b4a767745005f61af7e8e6996c959f9c1528d68ffe7af9b8b995e1dac24bb61e33791b4598431a0"

RPROVIDES:${PN} += "python3.9dist(biopython) python39-biopython python39-biopython(aarch-64) python3dist(biopython)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-numpy python39-xml"

inherit rpm

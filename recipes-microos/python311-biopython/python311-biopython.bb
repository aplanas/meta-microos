SUMMARY = "Python Tools for Computational Molecular Biology"
DESCRIPTION = "The Biopython Project is an international association of developers of freely \
available Python tools for computational molecular biology."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.81"

RPM_NAME = "python311-biopython-1.81-1.5.aarch64.rpm"
RPM_HASH = "c8095d04e2ac993ce1efa15002875a987e68798c202daf549c6e33285aa7b6bf7bd41ef89637b53b2a1be3843e806d0f5a7963c640ab60c0b880cdcc87a6620d"

RPROVIDES:${PN} += "python3.11dist(biopython) python311-biopython python311-biopython(aarch-64) python3dist(biopython)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-numpy python311-xml"

inherit rpm

SUMMARY = "Python Tools for Computational Molecular Biology"
DESCRIPTION = "The Biopython Project is an international association of developers of freely \
available Python tools for computational molecular biology."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.81"

RPM_NAME = "python310-biopython-1.81-1.5.aarch64.rpm"
RPM_HASH = "ae9d9f5ec973979f49d23dd756e00d479cc3060c8fcb43ad6b817bef729ca83dff6a0efad69ce8d33ac79ad6d3986f33081dac62aa1d4c3b45d1cbb6201625fc"

RPROVIDES:${PN} += "python3-biopython \
python3.10dist(biopython) \
python310-biopython \
python310-biopython(aarch-64) \
python3dist(biopython)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-numpy \
python310-xml"

inherit rpm

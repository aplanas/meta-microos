SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.2.2"

RPM_NAME = "python39-astropy-5.2.2-1.1.aarch64.rpm"
RPM_HASH = "00bb619b9266fac88d944c1f6abdd6aa306d7ca85c4cedc30697846f6b9860d8c0fd4070de2f02abe8669617c5cbd9218831b18a6bbd9946bf9240a38224feba"

RPROVIDES:${PN} += "python3.9dist(astropy) python39-astropy python39-astropy(aarch-64) python3dist(astropy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcfitsio.so.10()(64bit) libexpat.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libwcs.so.7()(64bit) python(abi) python39-PyYAML python39-dbm python39-numpy python39-packaging python39-pyerfa update-alternatives"

inherit rpm

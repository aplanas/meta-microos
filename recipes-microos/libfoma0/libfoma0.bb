SUMMARY = "Finite-state C library"
DESCRIPTION = "The library contains efficient implementations of all classical \
automata/transducer algorithms: determinization, minimization, \
epsilon-removal, composition, boolean operations. Also, more \
advanced construction methods are available: context restriction, \
quotients, first-order regular logic, transducers from replacement \
rules, etc."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "libfoma0-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "5b21c44329eaa52e318c7503c085d42f4315aa1002d917c57b42de25cfcfe4a3d7f44cbf3ebae2259e6cd9347ada4da5a16c7fed9c8bfd04b5ba508c34dac8d7"

RPROVIDES:${PN} += "libfoma.so.0()(64bit) \
libfoma0 \
libfoma0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.2.3)(64bit)"

inherit rpm

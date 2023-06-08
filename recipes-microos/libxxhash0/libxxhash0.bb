SUMMARY = "Shared library for xxHash - a non-cryptographic hash algorithm"
DESCRIPTION = "Shared library for xxHash - a hash algorithm. It completes the SMHasher test \
suite which evaluates collision, dispersion and randomness qualities of hash \
functions. Hashes are identical on all platforms."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "libxxhash0-0.8.1-3.3.aarch64.rpm"
RPM_HASH = "1b12e34da630a4737cdd90b7c4479d389f8cec3d2202e71780eab56a85fc850b9ba0e7f852e11fdd7f736de6f5ca5e10b2d67e4726282866f97dce4347a50851"

RPROVIDES:${PN} += "libxxhash.so.0()(64bit) libxxhash0 libxxhash0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

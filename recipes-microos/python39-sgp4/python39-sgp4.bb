SUMMARY = "Track earth satellite TLE orbits using up-to-date 2010 version of SGP4"
DESCRIPTION = "This Python package computes the position and velocity of an earth-orbiting \
satellite, given the satellite’s TLE orbital elements from a source like \
Celestrak. It implements the most recent version of SGP4, and is regularly run \
against the SGP4 test suite to make sure that its satellite position predictions \
agree to within 0.1 mm with the predictions of the standard distribution of the \
algorithm. This error is far less than the 1–3 km/day by which satellites \
themselves deviate from the ideal orbits described in TLE files. \
 \
This package compiles the verbatim source code from the official C++ version \
of SGP4. You can call the routine directly, or through an array API that loops \
over arrays of satellites and arrays of times with machine code instead of Python."
LICENSE = "MIT"

PV = "2.20"

RPM_NAME = "python39-sgp4-2.20-1.10.aarch64.rpm"
RPM_HASH = "b270244c030d6e16db73c161cd4dc2a45fe405cb7a177b176fc6fd996eab23524481420c136e445f314b32f93d94de84f5a34297fe825e9040b38b2a7b9ec8d0"

RPROVIDES:${PN} += "python3.9dist(sgp4) python39-sgp4 python39-sgp4(aarch-64) python3dist(sgp4)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) python(abi) python39-numpy"

inherit rpm

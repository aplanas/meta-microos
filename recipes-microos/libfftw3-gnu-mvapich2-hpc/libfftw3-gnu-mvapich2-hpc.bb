SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-mvapich2-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-mvapich2-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-mvapich2-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-mvapich2-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "6c5ab9066b2f8ba5d37232f95de4f44636a7294a52829e0db1b3d354ae6ffd42c7c47657446d0347116371f04aadb82cd26c47baed27e1ded9b104b0784c6bfa"

RPROVIDES:${PN} += "libfftw3-gnu-mvapich2-hpc \
libfftw3-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "libfftw3_3_3_10-gnu-mvapich2-hpc"

inherit rpm

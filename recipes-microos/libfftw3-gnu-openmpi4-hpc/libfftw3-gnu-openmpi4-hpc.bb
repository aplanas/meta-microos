SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-openmpi4-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-openmpi4-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-openmpi4-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-openmpi4-hpc-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "8879fc1420a8f85a38c8a1618d5a40ded3a807a5082715ceba0e1d7f8cb2c8b64b3b4d3fb6e17168960479444fcae5296017162f3948fe565db856a7ebfc96c3"

RPROVIDES:${PN} += "libfftw3-gnu-openmpi4-hpc libfftw3-gnu-openmpi4-hpc(aarch-64)"
RDEPENDS:${PN} += "libfftw3_3_3_10-gnu-openmpi4-hpc"

inherit rpm

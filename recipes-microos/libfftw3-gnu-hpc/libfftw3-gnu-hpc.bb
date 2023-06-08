SUMMARY = "Dependency package for libfftw3_3_3_10-gnu-hpc"
DESCRIPTION = "fftw3: Discrete Fourier Transform (DFT) C Subroutine Library \
The package libfftw3-gnu-hpc provides the dependency to get binary package libfftw3_3_3_10-gnu-hpc. \
When this package gets updated it installs the latest version of fftw3_3_3_10-gnu-hpc."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-gnu-hpc-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "ac14d189b9761a53c1b956d6d1a63b130536236b9cbfaf8009d3725a43756473d1e67597c114ed1d854897cf2877951ecb7587ab480a31e6d14d808fba7f07c9"

RPROVIDES:${PN} += "libfftw3-gnu-hpc libfftw3-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "libfftw3_3_3_10-gnu-hpc"

inherit rpm

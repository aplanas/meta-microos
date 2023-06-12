SUMMARY = "Algorithms for smoothing noisy data"
DESCRIPTION = "Algorithms for smoothing noisy data. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.3.0"

RPM_NAME = "octave-forge-data-smoothing-1.3.0-1.22.noarch.rpm"
RPM_HASH = "22eeb7e32549ece335b9eaa14d0b42e2beb0c9ff8aa9156eae3e0dab6879ceb31a1c3694407c52ab3810f2e8d18354bb7b71ef14c24c8511f711865d899cb9b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-data-smoothing"
RDEPENDS:${PN} += "/bin/sh \
octave-cli \
octave-forge-optim"

inherit rpm

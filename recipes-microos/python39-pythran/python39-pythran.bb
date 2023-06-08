SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python39-pythran-0.12.1-1.4.noarch.rpm"
RPM_HASH = "4e51a04b69d901613ab64163edd283ae02ff9f92813f3c2fa5613bcd2bab0d4e6494ba864caf17b361009999d657ea613356c4c2436b94c61d5b76c06cba9c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pythran) python39-pythran python3dist(pythran)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 boost-devel gcc-c++ openblas-devel python(abi) python39-beniget python39-devel python39-gast python39-numpy-devel python39-ply update-alternatives"

inherit rpm

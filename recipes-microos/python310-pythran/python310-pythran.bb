SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python310-pythran-0.12.1-1.4.noarch.rpm"
RPM_HASH = "3a9cb3ea4d786ac0c7a5f182db7fe9aa566e43f3a98b3cfd8029cf5905213c6dc04149cf13844edb55c0f675d2df08b36d3364ff26b3ff4c5ad57efe2c790203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythran python3.10dist(pythran) python310-pythran python3dist(pythran)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 boost-devel gcc-c++ openblas-devel python(abi) python310-beniget python310-devel python310-gast python310-numpy-devel python310-ply update-alternatives"

inherit rpm

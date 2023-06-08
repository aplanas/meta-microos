SUMMARY = "Ahead of Time compiler for numeric kernels"
DESCRIPTION = "Ahead of Time compiler for numeric kernels"
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python311-pythran-0.12.1-1.4.noarch.rpm"
RPM_HASH = "1c90edddc670cb0fcceef4b91228a447cd417fdabf16d45784bd40013cfeb038063861937ad11b98e20dbf7d8b208c707bc2d02ed71bf36ca856cd86feca8a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pythran) python311-pythran python3dist(pythran)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 boost-devel gcc-c++ openblas-devel python(abi) python311-beniget python311-devel python311-gast python311-numpy-devel python311-ply update-alternatives"

inherit rpm

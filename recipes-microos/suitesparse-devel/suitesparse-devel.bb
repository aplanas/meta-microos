SUMMARY = "Development headers for SuiteSparse"
DESCRIPTION = "suitesparse is a collection of libraries for computations involving \
sparse matrices. \
 \
The suitesparse-devel package contains files needed for developing \
applications which use the suitesparse libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "suitesparse-devel-5.13.0-49.1.aarch64.rpm"
RPM_HASH = "1e65a09057807a15878ff045712facbce3da4b7f7c71b8ad78b468c7a3eec8774a1ec0f8519099e76bf919d99199fc110bd43e8f5cd6d336b6e41ae1327d62e6"

RPROVIDES:${PN} += "SuiteSparse_config UFconfig-devel amd-devel libamd-devel libbtf-devel libcamd-devel libccolamd-devel libcholmod-devel libcolamd-devel libcsparse-devel libcxsparse-devel libgraphblas-devel libklu-devel libldl-devel libmongoose-devel librbio-devel libsliplu-devel libspqr-devel libsuitesparseconfig-devel libumfpack-devel suitesparse-common-devel suitesparse-devel suitesparse-devel(aarch-64) umfpack-devel"
RDEPENDS:${PN} += "gcc-c++ libamd2 libbtf1 libcamd2 libccolamd2 libcholmod3 libcolamd2 libcsparse3 libcxsparse3 libgraphblas7 libklu1 libldl2 libmongoose2 librbio2 libsliplu1 libspqr2 libsuitesparseconfig5 libumfpack5 metis-devel openblas-devel tbb-devel"

inherit rpm

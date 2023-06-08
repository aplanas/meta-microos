SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities. \
 \
This package is a dummy package that depends on the version of \
llvm-polly that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "llvm-polly-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "55b6129471d72a4f012bf63825e311086edcbd434eed6441e4c84dfd60b88c4db67d76660fef09213ebbed1d9f0f6c93e6d6472c87f54674a67f82025f524e89"

RPROVIDES:${PN} += "llvm-polly llvm-polly(aarch-64)"
RDEPENDS:${PN} += "llvm16-polly"

inherit rpm

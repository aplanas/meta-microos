SUMMARY = "Tensor-based phase-Amplitude coupling package"
DESCRIPTION = "Tensorpac is an Python toolbox for computing Phase-Amplitude Coupling \
(PAC) using tensors and parallel computing."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python39-tensorpac-1.1-2.3.noarch.rpm"
RPM_HASH = "be20a65f960b30827f07b1f922c3ddb28eddfac7f03a00015611006c667e51338c01a7494a1aa78b65b3bc3aee5acfee155f040922bd74a797d5385e5c81a9f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tensorpac) python39-tensorpac python3dist(tensorpac)"
RDEPENDS:${PN} += "python(abi) python39-joblib python39-numpy python39-scipy"

inherit rpm

SUMMARY = "Tensor-based phase-Amplitude coupling package"
DESCRIPTION = "Tensorpac is an Python toolbox for computing Phase-Amplitude Coupling \
(PAC) using tensors and parallel computing."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python310-tensorpac-1.1-2.3.noarch.rpm"
RPM_HASH = "d3df8cba7400e6c6b483dfce7f56a299360ee07a6f036e5f5b47cb58c5dffc0cede62686c0bd20bb1ee5d190151573cc8c2c4d0418af8242799a2e7e0f36b9ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tensorpac \
python3.10dist(tensorpac) \
python310-tensorpac \
python3dist(tensorpac)"
RDEPENDS:${PN} += "python(abi) \
python310-joblib \
python310-numpy \
python310-scipy"

inherit rpm

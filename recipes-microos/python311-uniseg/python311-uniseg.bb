SUMMARY = "Python module for determining Unicode text segmentations"
DESCRIPTION = "A pure Python module to determine Unicode text segmentations."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python311-uniseg-0.7.2-1.2.noarch.rpm"
RPM_HASH = "66db6ed454ae61be32aa53e6f771a42c85bf6b9fca671f4362bd940283fa14ead736a50de3fb4f6df0dfdbe0c5173ed98507c45d5bed0dbbe8a354ce2da3c848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(uniseg) python311-uniseg python3dist(uniseg)"
RDEPENDS:${PN} += "python(abi) python311"

inherit rpm

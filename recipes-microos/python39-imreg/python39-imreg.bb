SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2022.9.27"

RPM_NAME = "python39-imreg-2022.9.27-1.1.noarch.rpm"
RPM_HASH = "8c0f1e7d4b31733a6a07f945249ecce6f4dad21b11d6774031990584ef3d52373ff4691015441328f521935c10f0c5feb55dbcf8497f9fde3308d408f4e9fc17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(imreg) \
python39-imreg \
python3dist(imreg)"
RDEPENDS:${PN} += "python(abi) \
python39-numpy \
python39-scipy"

inherit rpm

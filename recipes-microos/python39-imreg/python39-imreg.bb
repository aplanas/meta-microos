SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2020.1.1"

RPM_NAME = "python39-imreg-2020.1.1-2.9.noarch.rpm"
RPM_HASH = "d22ae79baf649ad2d5f2d9e2a70cdfeda5bd081087e5a319ac440615d7e16789dadb8fde96172def29bfb96ec92fd2e02c5cedad4a3ae2414534abd6fa9f05f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(imreg) python39-imreg python3dist(imreg)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-scipy"

inherit rpm

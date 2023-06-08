SUMMARY = "Callback API implemented over Proton"
DESCRIPTION = "A messaging framework built on the QPID Proton engine. It \
provides a callback-based API for message passing"
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "python39-pyngus-2.3.1-1.9.noarch.rpm"
RPM_HASH = "8529cca8d2bde73633b1d670c4ad70589241375eca91e9d476aba2d16ec34fae6c039ee142f3915adc7c3fa6faa2eb5de6dde4e9da4f0b03661847050aa90f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyngus) python39-pyngus python3dist(pyngus)"
RDEPENDS:${PN} += "python(abi) python39-python-qpid-proton"

inherit rpm

SUMMARY = "PEG Parser-Interpreter framework for Python"
DESCRIPTION = "pyPEG is a plain and simple intrinsic parser interpreter framework \
for Python. It is based on Parsing Expression Grammar, PEG. \
With pyPEG you can parse many formal languages in a very easy way."
LICENSE = "GPL-2.0-only"

PV = "2.15.2"

RPM_NAME = "python311-pyPEG2-2.15.2-3.23.noarch.rpm"
RPM_HASH = "d43dc153aa06408f3fa0f25eeb754cc750c1b2376490c8a501c1def25fa52b8cdb574b8a6242e100fac53680605be98519f11ee33163196d5210a81054f899e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypeg2) \
python311-pyPEG2 \
python3dist(pypeg2)"
RDEPENDS:${PN} += "python(abi) \
python311-lxml"

inherit rpm

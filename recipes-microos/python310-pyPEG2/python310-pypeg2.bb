SUMMARY = "PEG Parser-Interpreter framework for Python"
DESCRIPTION = "pyPEG is a plain and simple intrinsic parser interpreter framework \
for Python. It is based on Parsing Expression Grammar, PEG. \
With pyPEG you can parse many formal languages in a very easy way."
LICENSE = "GPL-2.0-only"

PV = "2.15.2"

RPM_NAME = "python310-pyPEG2-2.15.2-3.23.noarch.rpm"
RPM_HASH = "c29d70dd6a0c32d1db62c5b325b2acd0e0578039749c7d1152e7dbaee541c2965d0da4c527d15e5b44fd840b0b7de26959a7161cc46156802438d4d9222ebc41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyPEG2 python3.10dist(pypeg2) python310-pyPEG2 python3dist(pypeg2)"
RDEPENDS:${PN} += "python(abi) python310-lxml"

inherit rpm

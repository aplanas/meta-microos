SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "python39-pscript-0.7.7-1.4.noarch.rpm"
RPM_HASH = "f2e39b3b5373f9e1ecd2da835aff9117ae4ff2171e138e99b077418d4cd19a87b32415a3cbe60c0c3d55f5eac652db3a2eb8f0c6b232a4dfda09be36759672a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pscript) python39-pscript python3dist(pscript)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

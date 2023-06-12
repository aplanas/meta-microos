SUMMARY = "A small INI library for Python"
DESCRIPTION = "A small INI library for Python."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python39-inifile-0.4.1-1.7.noarch.rpm"
RPM_HASH = "ae8d69b2984b245017077a8c0f2d553aafb08487d52aa7afe1e782d814d9e24e6fbd6cc38338ba46175cee405967bc4952a97de57a8f9ca30144a60fe1e3d66e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(inifile) \
python39-inifile \
python3dist(inifile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

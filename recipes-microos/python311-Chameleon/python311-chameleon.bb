SUMMARY = "Fast HTML/XML Template Compiler"
DESCRIPTION = "Chameleon is an HTML/XML template engine for Python. It uses the \
*page templates* language. \
 \
You can use it in any Python web application with just about any \
version of Python (2.5 and up, including 3.x and pypy)."
LICENSE = "BSD-3-Clause & BSD-4-Clause & Python-2.0 & ZPL-2.1"

PV = "3.10.2"

RPM_NAME = "python311-Chameleon-3.10.2-1.3.noarch.rpm"
RPM_HASH = "fad41509176314b30c18daddb7bd1fa47909ed29e426886f7256aeb622bb550e3891997f7fb462eae478cb51b7be8da78a25c0b1444e6de607462538dbdfaec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(chameleon) \
python311-Chameleon \
python3dist(chameleon)"
RDEPENDS:${PN} += "python(abi) \
python311-setuptools"

inherit rpm

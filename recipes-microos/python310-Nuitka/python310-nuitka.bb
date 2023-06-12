SUMMARY = "Python compiler with full language support and CPython compatibility"
DESCRIPTION = "Python compiler with full language support and CPython compatibility. \
 \
This Python compiler achieves full language compatibility and compiles Python \
code into compiled objects that are not second class at all. Instead they can be \
used in the same way as pure Python objects."
LICENSE = "Apache-2.0"

PV = "1.4.5"

RPM_NAME = "python310-Nuitka-1.4.5-2.1.noarch.rpm"
RPM_HASH = "aabb0483358da0a1478bb0da166156f9d25410118e665df433948c2dd0f248ca709f96845dbdcb7407c480ae93c9852105ff0dd49d35ea2d4925526938f6130b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Nuitka \
python3.10dist(nuitka) \
python310-Nuitka \
python3dist(nuitka)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
gcc-c++ \
python(abi) \
python310-Jinja2 \
python310-PyYAML \
python310-appdirs \
python310-atomicwrites \
python310-devel \
scons \
update-alternatives"

inherit rpm

SUMMARY = "Library with cross-python path, ini-parsing, io, code, log facilities"
DESCRIPTION = "The py lib is a Python development support library featuring \
the following tools and modules: \
 \
* py.path:  uniform local and svn path objects \
* py.apipkg:  explicit API control and lazy-importing \
* py.iniconfig:  easy parsing of .ini files \
* py.code: dynamic code generation and introspection \
* py.path:  uniform local and svn path objects"
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python310-py-1.11.0-4.1.noarch.rpm"
RPM_HASH = "7277c36420d118cfd97b37d086a72591f1bd2c260739377a838026be3ee3443d5cb93f5327a9c1070cac920dc8897e15740c5dee14cca96ff09e8309ad6cb89e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py \
python3.10dist(py) \
python310-py \
python3dist(py)"
RDEPENDS:${PN} += "python(abi) \
python310-apipkg \
python310-iniconfig"

inherit rpm

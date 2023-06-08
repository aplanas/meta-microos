SUMMARY = "iniconfig: brain-dead simple config-ini parsing"
DESCRIPTION = "iniconfig is a small and simple INI-file parser module \
having a unique set of features: \
 \
* tested against Python2.4 across to Python3.2, Jython, PyPy \
* maintains order of sections and entries \
* supports multi-line values with or without line-continuations \
* supports '#' comments everywhere \
* raises errors with proper line-numbers \
* no bells and whistles like automatic substitutions \
* iniconfig raises an Error if two sections have the same name."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-iniconfig-2.0.0-3.1.noarch.rpm"
RPM_HASH = "3bee535c4f7c0e5de656c4cfa0d0a4cc03a327b1ccd60a5fae7c635305fdf1cf539e51d0796aa2dd2efef104997b75b32846f44255c480265dec54991269dc63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(iniconfig) python311-iniconfig python3dist(iniconfig)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

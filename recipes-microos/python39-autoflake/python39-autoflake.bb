SUMMARY = "Program to removes unused Python imports and variables"
DESCRIPTION = "Autoflake removes unused imports and unused variables from Python \
code. It makes use of pyflakes to do this. \
 \
By default, autoflake only removes unused imports for modules that \
are part of the standard library. (Other modules may have side \
effects that make them unsafe to remove automatically.) Removal of \
unused variables is also disabled by default. \
 \
autoflake also removes useless pass statements."
LICENSE = "MIT"

PV = "1.5.3"

RPM_NAME = "python39-autoflake-1.5.3-1.4.noarch.rpm"
RPM_HASH = "a53237efce70d3226d125f0b44bb1ec73f3d1cd85ac0ded2286bf2ba9d8dc0af74beaa50306e2a805e463ae8a48fb120771cb86683845fdf56ac43715fa865f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(autoflake) python39-autoflake python3dist(autoflake)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-pyflakes python39-toml update-alternatives"

inherit rpm

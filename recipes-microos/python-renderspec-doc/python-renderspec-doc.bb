SUMMARY = "Documentation for the renderspec utility"
DESCRIPTION = "Documentation for the renderspec tool which is a tool to convert \
a spec.j2 Jinja2 template into a rpm .spec file."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python-renderspec-doc-2.2.0-2.2.noarch.rpm"
RPM_HASH = "e41410d8f0af735d27ac519eedc87d0882f2358ca0486512768528c008b038617e4d4e5764c79d2d2f26a1f80a69027216bcd0ff12eec3241f1650f2ea2c38be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-renderspec-doc"
RDEPENDS:${PN} += "python3-renderspec"

inherit rpm

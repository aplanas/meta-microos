SUMMARY = "Generate spec files from Jinja2 templates"
DESCRIPTION = "renderspec is a tool to convert a .spec.j2 Jinja2 template to \
a rpm .spec file which is usable for different distributions \
and follow their policies and processes."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python3-renderspec-2.2.0-2.2.noarch.rpm"
RPM_HASH = "08e5c4d36690823f401fd344edcc048b608dd334fe9d24c268fdede03ccbffe4a083edf46357d977e3804453672e9638e4c1e781256cd91f5b7d8a61b0ed9d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-renderspec python3.10dist(renderspec) python3dist(renderspec)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-Jinja2 python3-PyYAML python3-packaging python3-pymod2pkg"

inherit rpm

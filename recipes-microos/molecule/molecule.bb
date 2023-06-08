SUMMARY = "Aids in the development and testing of Ansible roles"
DESCRIPTION = "Molecule project is designed to aid in the development and testing of \
Ansible roles. \
 \
Molecule provides support for testing with multiple instances, operating \
systems and distributions, virtualization providers, test frameworks and \
testing scenarios."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "molecule-4.0.4-1.2.noarch.rpm"
RPM_HASH = "9dc9bbd2f84e4cf79ffc399953565649a18476e572312b62f41a07690ffd590c5ead0451c026fc82efbc1b37b3913055a850164e02fdb20ea6be353421e76e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molecule python3.10dist(molecule) python3dist(molecule)"
RDEPENDS:${PN} += "/usr/bin/python3.10 ansible python(abi) python3 python3-Jinja2 python3-PyYAML python3-ansible-compat python3-click python3-click-help-colors python3-cookiecutter python3-enrich python3-jsonschema python3-packaging python3-pluggy python3-rich"

inherit rpm

SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "6.3.0"

RPM_NAME = "python39-pytest-testinfra-6.3.0-2.1.noarch.rpm"
RPM_HASH = "989c4f934814bbfa473da7a7ba065d12452d5f0290bdd0f6baccc9b2f2d1f99fdeda22456034ff00d4e977d742971ce28a5d62d9eb0ef6121a14f3d4a518bb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-testinfra) python39-pytest-testinfra python39-testinfra python3dist(pytest-testinfra)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm

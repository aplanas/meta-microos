SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "6.3.0"

RPM_NAME = "python311-pytest-testinfra-6.3.0-2.1.noarch.rpm"
RPM_HASH = "9f714e942d3311bb4de32986b53e87e131c46690059a40ed5619649ff2e4d0500bd320ffc20232957c5e3943aae095fe5e0cc36e5bf779702eb43782ba1aac18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-testinfra) python311-pytest-testinfra python311-testinfra python3dist(pytest-testinfra)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm

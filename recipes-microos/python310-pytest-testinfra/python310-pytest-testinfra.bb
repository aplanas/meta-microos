SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "6.3.0"

RPM_NAME = "python310-pytest-testinfra-6.3.0-2.1.noarch.rpm"
RPM_HASH = "dee11b0376472f9f2ef9c25f99ef9c2ccbf3a791a0883d9c0f9aa94a8ec844995bf376744e6ddaacc3637dc410dc37f04a43eec0ce36d317ac9ad9dda1160fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-testinfra python3-testinfra python3.10dist(pytest-testinfra) python310-pytest-testinfra python310-testinfra python3dist(pytest-testinfra)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm

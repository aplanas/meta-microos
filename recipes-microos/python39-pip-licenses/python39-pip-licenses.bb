SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python39-pip-licenses-4.3.1-1.1.noarch.rpm"
RPM_HASH = "4c97c773e7045ffb7aa1fd31323fc3062984b5391ba71ea6fce5789072046aef8f5fe31ab613c3a932c40bd8f157c42071ba13bf00ee2217fa1056d99c33a8fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pip-licenses) python39-pip-licenses python3dist(pip-licenses)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-PrettyTable python39-pip update-alternatives"

inherit rpm

SUMMARY = "Oracle Cloud Infrastructure CLI"
DESCRIPTION = "The CLI is a small footprint tool that you can use on its own or with the \
Console to complete Oracle Cloud Infrastructure tasks. The CLI provides \
the same core functionality as the Console, plus additional commands. \
Some of these, such as the ability to run scripts, extend the Console's \
functionality."
LICENSE = "Apache-2.0"

PV = "3.24.0"

RPM_NAME = "oci-cli-3.24.0-1.1.noarch.rpm"
RPM_HASH = "16f2bdb56aa345763ee50c03264bfb9aade5712156b0a1eaa7a566ad468584f16fb22d6e15e180e1a48b569581351f7ea6d135f3c059b4a2f4cce368f732fd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oci-cli python3.10dist(oci-cli) python3dist(oci-cli)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-arrow python3-certifi python3-click python3-cryptography python3-jmespath python3-oci-sdk python3-prompt_toolkit python3-pyOpenSSL python3-python-dateutil python3-pytz python3-six python3-terminaltables"

inherit rpm

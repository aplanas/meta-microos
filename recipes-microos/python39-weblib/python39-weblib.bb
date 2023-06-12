SUMMARY = "Tools to solve typical tasks in Web scraping"
DESCRIPTION = "Weblib provides tools to solve typical tasks in Web scraping."
LICENSE = "MIT"

PV = "0.1.30"

RPM_NAME = "python39-weblib-0.1.30-2.6.noarch.rpm"
RPM_HASH = "f44992f21e22b7361060edfa10aa4661e1814fc1851db79427d1da55650f3a4c410ef3a3c4fe9888227b8845827bfa0d34f63b4e4ca527e405832dc37b4c62aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(weblib) \
python39-weblib \
python3dist(weblib)"
RDEPENDS:${PN} += "python(abi) \
python39-pytils \
python39-six \
python39-user_agent"

inherit rpm

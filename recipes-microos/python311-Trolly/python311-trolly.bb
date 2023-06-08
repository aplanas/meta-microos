SUMMARY = "Trello api"
DESCRIPTION = "A Python wrapper around the Trello API. Provides a group of \
Python classes to represent Trello Objects. None of the classes \
cache values as they are designed to be inherited and extended to \
suit the needs of each user. Each class includes a basic set of \
methods based on general use cases. This library was based on \
work done by [sarumont](https://github.com/sarumont/py-trello). \
Very little was kept from this code, but still props on the \
initial work."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-Trolly-0.2.2-4.12.noarch.rpm"
RPM_HASH = "96d2406cc19a454809861e338866a9a4ca47ec5c1a46b4e76bbbc2a95417fe2c1ea6e7b8dcaef0da2d42a6fcf7f1c6d0529223ebd8f023db560cec625f159e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(trolly) python311-Trolly python3dist(trolly)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

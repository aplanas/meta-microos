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

RPM_NAME = "python310-Trolly-0.2.2-4.12.noarch.rpm"
RPM_HASH = "00fd6cfdc5fdafc1268e3c278e974ca7cfdc7bb28e9b34ba144eb91c189bf4c8bb12d7c754b8575cc3d3d3467cc7758dcb499b97248aa3a43b0e578d2827c89a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Trolly python3.10dist(trolly) python310-Trolly python3dist(trolly)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

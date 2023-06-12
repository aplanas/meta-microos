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

RPM_NAME = "python39-Trolly-0.2.2-4.12.noarch.rpm"
RPM_HASH = "1a488f5405a98bc7dacaa74833e24b05766ed0c118e976a6a833cdbb045eb1d243e46c17c3b8e16ad85f1e76c0a32562b906a5997f87fae20f0dce966b2f3871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(trolly) \
python39-Trolly \
python3dist(trolly)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

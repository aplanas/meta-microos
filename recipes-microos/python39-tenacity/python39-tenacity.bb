SUMMARY = "Python module for retrying code until it succeeeds"
DESCRIPTION = "Tenacity is a general-purpose retrying library, written in Python, to simplify \
the task of adding retry behavior to just about anything. \
It originates from a fork of `Retrying`_ \
Features \
-------- \
- Generic Decorator API \
- Specify stop condition (i.e. limit by number of attempts) \
- Specify wait condition (i.e. exponential backoff sleeping between attempts) \
- Customize retrying on Exceptions \
- Customize retrying on expected returned result"
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python39-tenacity-8.1.0-1.3.noarch.rpm"
RPM_HASH = "5bd0a39a34c3c092cc00e0ee7354303dd9b2fe9e0dec73ddcc1c27c6b86cda44ec910363b7bfb033e6f0d4521b69d43caae5a6a2e916baab99083aedf0bc3cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tenacity) python39-tenacity python3dist(tenacity)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

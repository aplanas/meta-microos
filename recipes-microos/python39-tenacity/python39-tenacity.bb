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

PV = "8.2.2"

RPM_NAME = "python39-tenacity-8.2.2-1.1.noarch.rpm"
RPM_HASH = "f5fdeb4879909c5fde389f762858fbaf58b84ca35b193cf463ce6dadf58e4782d4f26910e88f46a0f3821364057a8df8e1aeec863f4c77d3797b20dcd2d26c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tenacity) python39-tenacity python3dist(tenacity)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

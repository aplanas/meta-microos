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

RPM_NAME = "python310-tenacity-8.1.0-1.3.noarch.rpm"
RPM_HASH = "0f68635b3a3bc589739dca15513d51d801a70913410e60ab63915177aca1fce0dfb81a9c52253202609fd34f275e1b4f5b88e75b6340619d8a6e3988c2ceef6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tenacity python3.10dist(tenacity) python310-tenacity python3dist(tenacity)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

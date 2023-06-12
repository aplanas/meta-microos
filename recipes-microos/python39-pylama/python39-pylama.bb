SUMMARY = "Code audit tool for python"
DESCRIPTION = "Code audit tool for Python. Pylama wraps these tools: \
 \
- pycodestyle (formerly pep8) © 2012-2013, Florent Xicluna; \
- pydocstyle (formerly pep257 by Vladimir Keleshev) © 2014, Amir Rachum; \
- PyFlakes © 2005-2013, Kevin Watters; \
- Mccabe © Ned Batchelder; \
- Pylint © 2013, Logilab; \
- Radon © Michele Lacchia \
- eradicate © Steven Myint; \
- Mypy © Jukka Lehtosalo and contributors; \
- Vulture © Jendrik Seipp and contributors;"
LICENSE = "MIT"

PV = "8.4.1"

RPM_NAME = "python39-pylama-8.4.1-2.1.noarch.rpm"
RPM_HASH = "c412013ee646cd972f56fca2fe407d0c7e0252ce89afcd854234ee978848ec1057453bb70f73259bb48a80a617251466e8098df2958a0125b173e99df762e18e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pylama) python39-pylama python3dist(pylama)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-mccabe python39-pycodestyle python39-pydocstyle python39-pyflakes update-alternatives"

inherit rpm

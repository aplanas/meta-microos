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

RPM_NAME = "python39-pylama-8.4.1-1.4.noarch.rpm"
RPM_HASH = "e74ba28fbbbd36f5a295ce8be6c2e62ec572a16c87292045b51b92f02807846e70c2c895e9c30edbce5aaf8f391f1f49212609fd21dcd7e9278a244d03f7173a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pylama) python39-pylama python3dist(pylama)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-mccabe python39-pycodestyle python39-pydocstyle python39-pyflakes update-alternatives"

inherit rpm

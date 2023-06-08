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

RPM_NAME = "python310-pylama-8.4.1-1.4.noarch.rpm"
RPM_HASH = "383126e5764cc3d833d13da81bcdf2b10337775af8bb668b802345c2e3f8b19bf7a6b6c574cacd015d5a60e65fa67dbab5fc59b890247d34d60a711d60a9c068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylama python3.10dist(pylama) python310-pylama python3dist(pylama)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-mccabe python310-pycodestyle python310-pydocstyle python310-pyflakes update-alternatives"

inherit rpm

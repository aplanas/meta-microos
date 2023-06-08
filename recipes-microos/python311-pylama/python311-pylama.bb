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

RPM_NAME = "python311-pylama-8.4.1-1.4.noarch.rpm"
RPM_HASH = "47c4d6a782fac3b9607979b902aa18407e746d556a790923bf2e877cacc63979aa0c24910fd1609c442489c5959600d7b203619661d7c8e6e2ef30afc29ff462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pylama) python311-pylama python3dist(pylama)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-mccabe python311-pycodestyle python311-pydocstyle python311-pyflakes update-alternatives"

inherit rpm

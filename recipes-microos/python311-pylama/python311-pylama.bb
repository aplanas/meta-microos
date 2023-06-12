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

RPM_NAME = "python311-pylama-8.4.1-2.1.noarch.rpm"
RPM_HASH = "4987ab82d5568c3ccaf5f264b2c3f68007818a2fead2e44515d9b3923ba1a56bc6dfba6416da0903c18448c4a409ac843621f568e339415a865eb19991ae4544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pylama) \
python311-pylama \
python3dist(pylama)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-mccabe \
python311-pycodestyle \
python311-pydocstyle \
python311-pyflakes \
update-alternatives"

inherit rpm

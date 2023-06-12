SUMMARY = "A plugin to fake subprocess for pytest"
DESCRIPTION = "A pytest plugin to fake subprocess for pytest.  The plugin adds the \
``fake_process`` fixture (and ``fp`` as an alias).  It can be used it to \
register subprocess results so you won't need to rely on the real processes."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-pytest-subprocess-1.5.0-1.1.noarch.rpm"
RPM_HASH = "275ccef1d127131da280da5c0c312c4dc35539f8f8fbea3b4ded371dd0d3c98bfd23a6081305d251add769c195ce444d4245c2d6a8416c5e0a51ce58484afa72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-subprocess \
python3.10dist(pytest-subprocess) \
python310-pytest-subprocess \
python3dist(pytest-subprocess)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm

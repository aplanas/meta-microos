SUMMARY = "A plugin to fake subprocess for pytest"
DESCRIPTION = "A pytest plugin to fake subprocess for pytest.  The plugin adds the \
``fake_process`` fixture (and ``fp`` as an alias).  It can be used it to \
register subprocess results so you won't need to rely on the real processes."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-pytest-subprocess-1.5.0-1.1.noarch.rpm"
RPM_HASH = "53a0335487ae74ddcc79e8013fe86054a5a9c1d96cf4e409d44dbbe94435f76dc573e02d33f09f4eb0976af821cdbefc4478f891fbd74b955aeebf9d903303e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-subprocess) python311-pytest-subprocess python3dist(pytest-subprocess)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm

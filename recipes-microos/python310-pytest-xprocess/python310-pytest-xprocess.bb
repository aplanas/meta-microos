SUMMARY = "A pytest plugin for managing processes across test runs"
DESCRIPTION = "This will provide a xprocess fixture which can be used to ensure that \
external processes on which your application depends are up and running \
during testing. You can also use it to start and pre-configure \
test-specific databases (i.e. Postgres, Couchdb)."
LICENSE = "MIT"

PV = "0.22.2"

RPM_NAME = "python310-pytest-xprocess-0.22.2-1.1.noarch.rpm"
RPM_HASH = "135044bde8dc959acc79387f6607a28ab43d3f034b193e6d58551108471c03237fe5c1d3e2b3419297c2982d0cca543a9fbb4f9a4b21ea046786aa14fad4f1ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-xprocess python3.10dist(pytest-xprocess) python310-pytest-xprocess python3dist(pytest-xprocess)"
RDEPENDS:${PN} += "python(abi) python310-psutil python310-py python310-pytest"

inherit rpm

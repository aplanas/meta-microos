SUMMARY = "Pytest plugin to select tests based on attributes"
DESCRIPTION = "The pytest-attrib plugin extends py.test with the ability to select tests \
based on a criteria rather than just the filename or pytest.marks. For \
example, you might want to run only tests that need internet connectivity, \
or tests that are slow. \
 \
The pytest.mark  plugin already provides a featrure to mark tests and run \
only the marked tests. This plugin also allows to run expressions on the \
attributes of the class, and does not require the pytest.mark decorator. \
 \
It offers features similar to the nose plugin nose-attrib."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python39-pytest-attrib-0.1.3-3.33.noarch.rpm"
RPM_HASH = "a1f461264ec36d3e2414c8c3c2defebe6087d7939439e09f52b7733dcbe4b471539dc124e61b9a1ec60e83ec408680da75e17d9b55f717ebba6801ee58db9a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-attrib) python39-pytest-attrib python3dist(pytest-attrib)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm

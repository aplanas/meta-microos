SUMMARY = "BDD for pytest"
DESCRIPTION = "BDD library for the py.test runner \
 \
pytest-bdd implements a subset of Gherkin language for the automation of the project \
requirements testing and easier behavioral driven development. \
 \
Unlike many other BDD tools it doesn't require a separate runner and benefits from \
the power and flexibility of the pytest. It allows to unify your unit and functional \
tests, easier continuous integration server configuration and maximal reuse of the \
tests setup. \
 \
Pytest fixtures written for the unit tests can be reused for the setup and actions \
mentioned in the feature steps with dependency injection, which allows a true BDD \
just-enough specification of the requirements without maintaining any context object \
containing the side effects of the Gherkin imperative declarations."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-pytest-bdd-5.0.0-1.7.noarch.rpm"
RPM_HASH = "e84d3c0d16026f20719d2f668460fe37ca94ee747e28e832db9dfdab063e102c85208075229b5dfe515525851b6aaef8989280f3201dfcbf44fd4bb7072be556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-bdd) \
python311-pytest-bdd \
python3dist(pytest-bdd)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Mako \
python311-glob2 \
python311-parse \
python311-parse_type \
python311-py \
python311-pytest \
update-alternatives"

inherit rpm

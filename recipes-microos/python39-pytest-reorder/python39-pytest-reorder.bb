SUMMARY = "Pytest plugin for reordering tests depending on their paths and names"
DESCRIPTION = "Reorder tests depending on their nodeids (strings of test file path plus test name plus \
parametrization, like: \
``test/test_prefix_reordering.py::test_reordering_default[test_names5-expected_test_order5]``). \
 \
Normally tests are sorted alphabetically. That makes integration tests run before unit tests. \
 \
With **pytest_reorder** you can install a hook that will change the order of tests in the suite. \
By default **pytest_reorder** will seek for *unit*, *integration* and *ui* tests and put them in \
the following order: \
 \
  * *unit* \
  * all tests with names not indicating unit, integration, nor UI tests \
  * *integration* \
  * *ui* \
 \
The default regular expressions can find unit, integration and UI tests both laid flat and **deeply \
nested**. You can also specify your custom order."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-pytest-reorder-0.1.1-2.7.noarch.rpm"
RPM_HASH = "a7630da63bd682ac45de4657f6b2719d1cfe9add93eab7444827fc3b70e0cd22733f1a23032d41fddad35b3fc96d0d41564406898722716c603ef89a79284e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-reorder) \
python39-pytest-reorder \
python3dist(pytest-reorder)"
RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm

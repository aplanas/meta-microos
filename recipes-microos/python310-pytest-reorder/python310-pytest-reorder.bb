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

RPM_NAME = "python310-pytest-reorder-0.1.1-2.7.noarch.rpm"
RPM_HASH = "46dcf16f514ac6f9e880b3e3f2ba53a2b2a311fea2b128158d38ec64377771e21c1074c3da03eeda2b2049f55e30a5f04018c4ee5d74bde8638518a74965e203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-reorder python3.10dist(pytest-reorder) python310-pytest-reorder python3dist(pytest-reorder)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm

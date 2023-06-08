SUMMARY = "Pytest plugin to randomly order tests and control random.seed"
DESCRIPTION = "Pytest plugin to randomly order tests and control random.seed. \
 \
Features: \
   * Randomly shuffles the order of test items. This is done first at \
     the level of modules, then at the level of test classes (if you \
     have them), then at the order of functions. This also works with \
     things like doctests. \
   * Resets random.seed() at the start of every test case and test to \
     fixed number - this defaults to time.time() from the start of \
     your test run, but you can pass in --randomly-seed to repeat a \
     randomness-induced failure. \
   * If factory boy is installed, its random state is reset at the \
     start of every test. This allows for repeatable use of its random \
     'fuzzy' features. \
   * If faker is installed, its random state is reset at the start of \
     every test. This is also for repeatable fuzzy data in tests. \
   * If numpy is installed, its random state is reset at the start of \
     every test."
LICENSE = "MIT"

PV = "3.7.0"

RPM_NAME = "python310-pytest-randomly-3.7.0-2.1.noarch.rpm"
RPM_HASH = "1714da71afed4e10e0902ebfb884b1fc69a98313a4f23f3e95bbed0ee18fc2525090928c2e6cde4d7610b53418fe17fb6de14f83b88db712a849a135dc9a9fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-randomly python3.10dist(pytest-randomly) python310-pytest-randomly python3dist(pytest-randomly)"
RDEPENDS:${PN} += "python(abi) python310-importlib-metadata python310-pytest"

inherit rpm

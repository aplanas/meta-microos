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

PV = "3.12.0"

RPM_NAME = "python311-pytest-randomly-3.12.0-1.1.noarch.rpm"
RPM_HASH = "3a567aa4cd08261436db6fdc3930173dd7204e388c8bfdd19fdb553c9ac9e5e58ed7228fbd962cfa4e01472a50c17705610cca04c4ed60e21b15bbb3d12cd5d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-randomly) python311-pytest-randomly python3dist(pytest-randomly)"
RDEPENDS:${PN} += "python(abi) python311-importlib-metadata python311-pytest"

inherit rpm

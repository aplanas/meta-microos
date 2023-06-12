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

RPM_NAME = "python39-pytest-randomly-3.12.0-1.1.noarch.rpm"
RPM_HASH = "78894ae69256fa28e8f88af92ce70f83cb5734554f5f6cc515331fbebeaad5ee37f1da8bf54e3c6df63f9ecc8160449e9eec4d127413a7f662f1d2b322ea139b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-randomly) python39-pytest-randomly python3dist(pytest-randomly)"
RDEPENDS:${PN} += "python(abi) python39-importlib-metadata python39-pytest"

inherit rpm

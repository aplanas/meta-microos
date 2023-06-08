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

RPM_NAME = "python39-pytest-randomly-3.7.0-2.1.noarch.rpm"
RPM_HASH = "533ef6b3c38082f3474affe0d1e393d18aa2788a6b1d9a8bdc7138071c058b515d2eb62aac804e30311f8c1dcee4f69399f2ef56d6a7613f4213299ba90465c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-randomly) python39-pytest-randomly python3dist(pytest-randomly)"
RDEPENDS:${PN} += "python(abi) python39-importlib-metadata python39-pytest"

inherit rpm

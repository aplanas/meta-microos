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

RPM_NAME = "python311-pytest-randomly-3.7.0-2.1.noarch.rpm"
RPM_HASH = "a5e1d0f432f6215e90ab44334c6efea64782b0cf3ab8a39fbf5fee842181c0b2a8e9ea06ed3961df833dadbc2badaf75f02c9389bc51835ac794eb2728c80b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-randomly) python311-pytest-randomly python3dist(pytest-randomly)"
RDEPENDS:${PN} += "python(abi) python311-importlib-metadata python311-pytest"

inherit rpm

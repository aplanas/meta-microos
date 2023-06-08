SUMMARY = "Distributed testing and loop-on-failing for py.test"
DESCRIPTION = "The `pytest-xdist`_ plugin extends py.test with some unique \
test execution modes: \
 \
* test run parallelization_: if you have multiple CPUs or hosts you can use \
  those for a combined test run.  This allows to speed up \
  development or to use special resources of `remote machines`_. \
 \
* ``--boxed``: (not available on Windows) run each test in a boxed_ \
  subprocess to survive ``SEGFAULTS`` or otherwise dying processes \
 \
* ``--looponfail``: run your tests repeatedly in a subprocess.  After each run \
  py.test waits until a file in your project changes and then re-runs \
  the previously failing tests.  This is repeated until all tests pass \
  after which again a full run is performed. \
 \
* `Multi-Platform`_ coverage: you can specify different Python interpreters \
  or different platforms and run tests in parallel on all of them. \
 \
Before running tests remotely, ``py.test`` efficiently 'rsyncs' your \
program source code to the remote place.  All test results \
are reported back and displayed to your local terminal. \
You may specify different Python versions and interpreters."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python39-pytest-xdist-3.2.1-2.1.noarch.rpm"
RPM_HASH = "37dd704a3a8579d38a3dc79b0274f53ba5ef5bd2cd47bbd09731fe50f8bd692684c8a20b025ea9d77bea120580c43ec9d37fcb004ab04654e4b7a2ddd1d497e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-xdist) python39-pytest-xdist python3dist(pytest-xdist)"
RDEPENDS:${PN} += "python(abi) python39-execnet python39-pytest"

inherit rpm

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

RPM_NAME = "python311-pytest-xdist-3.2.1-2.1.noarch.rpm"
RPM_HASH = "bdbea027ce91ea52e5eac9065137ff53eceb1c83b975588c541e488ef4c0eda454f6d352d7f29de6098f30c24e6c5fc52ac29240daa81eee4b3d1059608d5f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-xdist) python311-pytest-xdist python3dist(pytest-xdist)"
RDEPENDS:${PN} += "python(abi) python311-execnet python311-pytest"

inherit rpm

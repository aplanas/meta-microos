SUMMARY = "A parallel Python test runner built around subunit"
DESCRIPTION = "stestr is parallel Python test runner designed to execute unittest test suites \
using multiple processes to split up execution of a test suite. It also will \
store a history of all test runs to help in debugging failures and optimizing \
the scheduler to improve speed. To accomplish this goal it uses the subunit \
protocol to facilitate streaming and storing results from multiple workers. \
 \
stestr originally started as a fork of the testrepository project. But, instead \
of being an interface for any test runner that used subunit, like testrepository, \
stestr concentrated on being a dedicated test runner for python projects. While \
stestr was originally forked from testrepository it is not backwards compatible \
with testrepository. At a high level the basic concepts of operation are shared \
between the two projects but the actual usage is not exactly the same."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python39-stestr-3.2.1-2.3.noarch.rpm"
RPM_HASH = "fc2eea07f903e2d73147a8bb15801e4589d0ad12c1a4b01ec74059c10159e01f427ec6cf5dabe4d6d9292056d3eaaa68f4060b3170131e30e905c8240a93280b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(stestr) python39-stestr python3dist(stestr)"
RDEPENDS:${PN} += "python(abi) python39-PyYAML python39-fixtures python39-future python39-pbr python39-python-subunit python39-testtools python39-voluptuous"

inherit rpm

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

RPM_NAME = "python310-stestr-3.2.1-2.3.noarch.rpm"
RPM_HASH = "951905cde9ae6b8c168afdd6062e0a498f001b5297ee98e15b2d211f50375a73892cac56d3d8634fc237ba061333a0216584ae127216f95b5025fc74a6fe99ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stestr python3.10dist(stestr) python310-stestr python3dist(stestr)"
RDEPENDS:${PN} += "/usr/bin/python3.10 python(abi) python3-cliff python310-PyYAML python310-dbm python310-fixtures python310-future python310-pbr python310-python-subunit python310-testtools python310-voluptuous"

inherit rpm

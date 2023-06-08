SUMMARY = "Streaming protocol for test results"
DESCRIPTION = "Subunit is a streaming protocol for test results.  The protocol is a \
binary encoding that is generated and parsed.  By design, all the \
components of the protocol conceptually fit into the xUnit TestCase -> \
TestResult interaction. \
 \
Subunit comes with command line filters to process a subunit stream and \
language bindings for Python, C, C++ and Shell. Bindings can be \
written for other languages. \
 \
A number of useful things can be done easily with subunit: \
- Test aggregation: Tests run separately can be combined and then \
  reported/displayed together.  For instance, tests from different \
  languages can be shown as a seamless whole. \
- Test archiving: A test run may be recorded and replayed later. \
- Test isolation: Tests that may crash or otherwise interact badly with \
  each other can be run separately and then aggregated, rather than \
  interfering with each other. \
- Grid testing: subunit can act as the necessary serialization and \
  deserialization to get test runs on distributed machines to be \
  reported in real time."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python39-python-subunit-1.4.2-2.2.noarch.rpm"
RPM_HASH = "88e4248c955dc5fbe137307ba3069278e526ba5021797abd01d4d28870e3566bb0c66291345c36a188c1f1ab08749ce999f008ff9514eb8f92a73c33b563a84c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-subunit) python39-python-subunit python3dist(python-subunit)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python39-extras python39-testtools"

inherit rpm

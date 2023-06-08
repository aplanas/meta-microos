SUMMARY = "Convenience plugin on top of mockito"
DESCRIPTION = "Integration of Mockito functionality into Pytest. \
 \
For example: \
  def test_foo(when): \
      when(os.path).exists('/foo').thenReturn(False)"
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "python39-pytest-mockito-0.0.4-2.7.noarch.rpm"
RPM_HASH = "fd0c19a837de6a62ea3644caef411c49a3a3129737c4d014e618e208031102344556f6072d122c49acfe0d6a186de5a33708ebb3cc1ea9b3e82f9ac40100030b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-mockito) python39-pytest-mockito python3dist(pytest-mockito)"
RDEPENDS:${PN} += "ca-certificates python(abi) python39 python39-mockito python39-pytest"

inherit rpm

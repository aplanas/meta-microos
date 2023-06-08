SUMMARY = "Convenience plugin on top of mockito"
DESCRIPTION = "Integration of Mockito functionality into Pytest. \
 \
For example: \
  def test_foo(when): \
      when(os.path).exists('/foo').thenReturn(False)"
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "python310-pytest-mockito-0.0.4-2.7.noarch.rpm"
RPM_HASH = "ca742ec390564f3b6bf0fbdf42b3be923cb971d23235ee7f281f7ef7af924828e48ee4ffe7abd918bfdd2b718f72584f004cee28ed51cef9791e1d91667d62c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mockito python3.10dist(pytest-mockito) python310-pytest-mockito python3dist(pytest-mockito)"
RDEPENDS:${PN} += "ca-certificates python(abi) python310 python310-mockito python310-pytest"

inherit rpm

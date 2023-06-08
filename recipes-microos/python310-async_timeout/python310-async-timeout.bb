SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python310-async_timeout-4.0.2-3.1.noarch.rpm"
RPM_HASH = "6690e6348bdce2ac41b1073838c8886900d9781a60e824895d2372b4bbf68811eeafbe1115ae7f6e8fa3c0075cb25294579b6f94e3253076c175baf9b8a00166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-timeout python3-async_timeout python3.10dist(async-timeout) python310-async-timeout python310-async_timeout python3dist(async-timeout)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

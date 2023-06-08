SUMMARY = "Pytest plugin for controlling remote data access"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to control unit tests that require access to data from the internet."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-pytest-remotedata-0.4.0-1.1.noarch.rpm"
RPM_HASH = "182ad86509081744f92b5dd8c6d49cb3f04cbcae31dee8075f7b956f90399cd98d036aacd536be94f02f0ea60047c8e59da717f06d80338df54a6fdeedfee2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-remotedata python3.10dist(pytest-remotedata) python310-pytest-remotedata python3dist(pytest-remotedata)"
RDEPENDS:${PN} += "python(abi) python310-packaging python310-pytest"

inherit rpm

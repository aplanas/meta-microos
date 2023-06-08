SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python39-pytest-relaxed-2.0.0-2.1.noarch.rpm"
RPM_HASH = "ffe02ea9849636d53901579d84e012c8b63e43fa06a50bfeeade5dd5f35a9ae6e7740f1b993b7cd1724abc99e9dd96b3fc82e18d1d6a137d8048601f13e600c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-relaxed) python39-pytest-relaxed python3dist(pytest-relaxed)"
RDEPENDS:${PN} += "python(abi) python39-decorator python39-pytest"

inherit rpm

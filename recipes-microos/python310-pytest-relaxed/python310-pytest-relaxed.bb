SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python310-pytest-relaxed-2.0.0-2.1.noarch.rpm"
RPM_HASH = "34978699c062be7e85fac0fc774f9b948d0c52702620c6af6484be6c9d5c48d138dabf96ccb9096677acb7ac1f0723be196c28652004e21f6fb22c88ff577372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-relaxed python3.10dist(pytest-relaxed) python310-pytest-relaxed python3dist(pytest-relaxed)"
RDEPENDS:${PN} += "python(abi) python310-decorator python310-pytest"

inherit rpm

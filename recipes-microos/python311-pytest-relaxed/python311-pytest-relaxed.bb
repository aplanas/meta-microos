SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python311-pytest-relaxed-2.0.0-2.1.noarch.rpm"
RPM_HASH = "e58fb2cf88fd18fca46128e5fcefc3ec2b125a994160499f5c503d1647ed2541963b73d79d07bb3c7886ba44972f9bc37ee1f563faeac248700bebe697d1c037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-relaxed) python311-pytest-relaxed python3dist(pytest-relaxed)"
RDEPENDS:${PN} += "python(abi) python311-decorator python311-pytest"

inherit rpm

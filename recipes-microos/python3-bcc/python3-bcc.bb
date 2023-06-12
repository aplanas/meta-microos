SUMMARY = "Python3 bindings for the BPF Compiler Collection"
DESCRIPTION = "Python 3.x bindings for the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "python3-bcc-0.26.0-2.10.noarch.rpm"
RPM_HASH = "a59ee200c597cd9271494b8df9756a80d01588f37d4ff178a8b82b93d8093289a24d03e88fea6ee31b7ed051585cae098cc74e780854a94723ecee28c815b3cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bcc \
python3.10dist(bcc) \
python3dist(bcc)"
RDEPENDS:${PN} += "libbcc0 \
python(abi)"

inherit rpm

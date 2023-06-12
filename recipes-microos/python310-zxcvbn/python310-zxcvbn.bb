SUMMARY = "Python password strength estimator"
DESCRIPTION = "Python password strength estimator."
LICENSE = "MIT"

PV = "4.4.28"

RPM_NAME = "python310-zxcvbn-4.4.28-1.20.noarch.rpm"
RPM_HASH = "4faf9972a9ca3efad93993cb3093a530a879c1eb8e0ffa1e0d2815ab10ce47f248748840c6b832edc054d97b069aa973c6b1d8e59b34f9f54f1c15a364dc8239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zxcvbn \
python3.10dist(zxcvbn) \
python310-zxcvbn \
python3dist(zxcvbn)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi)"

inherit rpm

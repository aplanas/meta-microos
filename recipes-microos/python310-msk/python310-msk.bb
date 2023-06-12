SUMMARY = "Mycroft Skills Kit"
DESCRIPTION = "Mycroft Skills Kit python module."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-msk-0.4.0-1.4.noarch.rpm"
RPM_HASH = "b9eef015ff0ac2421587f533c94f3aaa60c8ec0daf45a018e2f96eeb9e656d45bc98a01145b0e6009d4eba7ecaee559f652c8fcfcd433d6d5bd3ba20c1afdb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msk \
python3.10dist(msk) \
python310-msk \
python3dist(msk)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-GitPython \
python310-PyGithub \
python310-msm \
update-alternatives"

inherit rpm

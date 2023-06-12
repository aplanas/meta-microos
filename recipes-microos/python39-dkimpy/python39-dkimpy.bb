SUMMARY = "DKIM (DomainKeys Identified Mail)"
DESCRIPTION = "DKIM (DomainKeys Identified Mail)"
LICENSE = "BSD-2-Clause"

PV = "1.0.5"

RPM_NAME = "python39-dkimpy-1.0.5-1.12.noarch.rpm"
RPM_HASH = "ddac1a65605d2f2e8d7e1e363115b51ae7d9988901ed0e3db7cc62000448bfb32229e7bc8efdf56422468b257b68a09db83fa95a5b8315284bad2bfccea19fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dkimpy) \
python39-dkimpy \
python3dist(dkimpy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyNaCl \
python39-authres \
python39-dnspython \
python39-setuptools \
update-alternatives"

inherit rpm

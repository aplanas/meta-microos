SUMMARY = "Sphinx integration with different issuetrackers"
DESCRIPTION = "A Sphinx extension to reference issues in issue trackers, either explicitly \
with an 'issue' role or optionally implicitly by issue ids like ``#10`` in \
plaintext."
LICENSE = "BSD-2-Clause"

PV = "0.11"

RPM_NAME = "python310-sphinxcontrib-issuetracker-0.11-10.15.noarch.rpm"
RPM_HASH = "16a448c8669f4cf6838b618e4b65918e143e2ce7ed314213c5ce3068feca5f119c7a29cffb45c8defe39f780b3a47a995453076d7cb02bfe41350ecbd52c6bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-issuetracker python3.10dist(sphinxcontrib-issuetracker) python310-sphinxcontrib-issuetracker python3dist(sphinxcontrib-issuetracker)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx python310-requests"

inherit rpm

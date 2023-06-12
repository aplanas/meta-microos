SUMMARY = "Sphinx integration with different issuetrackers"
DESCRIPTION = "A Sphinx extension to reference issues in issue trackers, either explicitly \
with an 'issue' role or optionally implicitly by issue ids like ``#10`` in \
plaintext."
LICENSE = "BSD-2-Clause"

PV = "0.11"

RPM_NAME = "python39-sphinxcontrib-issuetracker-0.11-10.15.noarch.rpm"
RPM_HASH = "0b173f13ed64851fd8be8eb392618e1b81e1dc77314100422664ae2ab9d33271d95f7a28a42dc390a89bc51802943a7b3e9a1b1e1ea3c72aa957f698d4a646bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-issuetracker) \
python39-sphinxcontrib-issuetracker \
python3dist(sphinxcontrib-issuetracker)"
RDEPENDS:${PN} += "python(abi) \
python39-Sphinx \
python39-requests"

inherit rpm

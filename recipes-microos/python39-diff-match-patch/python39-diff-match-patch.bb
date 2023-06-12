SUMMARY = "Repackaging of Google's Diff Match and Patch libraries"
DESCRIPTION = "Offers algorithms to perform the operations required for synchronizing plain text"
LICENSE = "Apache-2.0"

PV = "20200713"

RPM_NAME = "python39-diff-match-patch-20200713-1.11.noarch.rpm"
RPM_HASH = "5c63a3872f650c80c3cbbd62302b459a58f1daae57049ec32b0619c1c8dd30c3e87d11376ea93e46d5f14ba1672110488cf736fa950cd0b705d90b782e9dd48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(diff-match-patch) \
python39-diff-match-patch \
python39-diff_match_patch \
python3dist(diff-match-patch)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

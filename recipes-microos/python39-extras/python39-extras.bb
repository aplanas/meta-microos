SUMMARY = "Extra bits for Python"
DESCRIPTION = "extras is a set of extensions to the Python standard library, originally \
written to make the code within testtools cleaner, but now split out for \
general use outside of a testing context."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-extras-1.0.0-6.1.noarch.rpm"
RPM_HASH = "4f352867e949811a60b1e0a5af37fbf6105ed5d9e4a283952a26cb584c2411cdecae252d9d2513433ee318d21a628e91aa11f088ba345c3916887315c7561b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(extras) \
python39-extras \
python3dist(extras)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

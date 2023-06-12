SUMMARY = "A few extensions to pyyaml"
DESCRIPTION = "A few extensions to pyyaml."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-aspy.yaml-1.3.0-2.8.noarch.rpm"
RPM_HASH = "baad3723f1068be9f8ffb3717e24d6457e0248a516b7351001a3b144a6b761c7ad835f85e97eb2675d4323da7ad2ec61554e72f055b635510c91f2b49fbb7241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aspy.yaml \
python3.10dist(aspy.yaml) \
python310-aspy.yaml \
python3dist(aspy.yaml)"
RDEPENDS:${PN} += "python(abi) \
python310-PyYAML"

inherit rpm
